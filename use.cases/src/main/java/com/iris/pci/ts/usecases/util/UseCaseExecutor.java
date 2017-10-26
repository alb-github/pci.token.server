package com.iris.pci.ts.usecases.util;

import com.iris.pci.ts.usecases.UseCaseException;

public interface UseCaseExecutor {

	<T> T execute(UseCase<T> useCase) throws UseCaseException;
	<T> T executeSoft(UseCase<T> useCase);

}
