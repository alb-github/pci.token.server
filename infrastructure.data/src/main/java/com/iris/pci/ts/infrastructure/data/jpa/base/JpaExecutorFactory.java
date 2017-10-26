package com.iris.pci.ts.infrastructure.data.jpa.base;

import com.iris.pci.ts.usecases.util.UseCaseExecutorFactory;
import com.iris.pci.ts.usecases.util.UseCaseExecutor;

public class JpaExecutorFactory implements UseCaseExecutorFactory {

	public UseCaseExecutor get() {
		return new JpaExecutorImpl();
	}

}
