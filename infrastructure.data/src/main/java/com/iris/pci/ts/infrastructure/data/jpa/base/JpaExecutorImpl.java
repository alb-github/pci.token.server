package com.iris.pci.ts.infrastructure.data.jpa.base;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.iris.pci.ts.usecase.UseCaseException;
import com.iris.pci.ts.usecase.util.UseCase;
import com.iris.pci.ts.usecase.util.UseCaseExecutor;

class JpaExecutorImpl implements UseCaseExecutor {

	/**
	 * This method does not throw UseCaseExceptons, while still uses the same 
	 * command interface
	 */
	public <T> T executeSoft(UseCase<T> command) {
		try {
			return execute( command );
		} catch (UseCaseException e) {
			throw new IllegalStateException(
				"This should not happend. "
				+ "This UseCaseException must not be produced"
			);
		}
	}

	public <T> T execute(UseCase<T> command) throws UseCaseException {
		T res = null;

		EntityManager em = Jpa.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {

			res = command.execute();
			tx.commit();
			return res;
			
		} catch (UseCaseException ucex){
			rollback(tx);
			throw ucex;
			
		} catch (RuntimeException rex) {
			
			rollback(tx);
			throw rex;
		} finally {
			
			close(em);
		}
	}

	protected void close(EntityManager em) {
		if (em.isOpen()){
			em.close();
		}
	}
	
	private void rollback(EntityTransaction tx) {
		if ( tx.isActive() ) {
			tx.rollback();
		}
	}

}
