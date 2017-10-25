package com.iris.pci.ts.infrastructure.data.jpa.base;

import com.iris.pci.ts.usecase.util.ExecutorFactory;
import com.iris.pci.ts.usecase.util.UseCaseExecutor;

public class JpaExecutorFactory implements ExecutorFactory {

	public UseCaseExecutor get() {
		return new JpaExecutorImpl();
	}

}
