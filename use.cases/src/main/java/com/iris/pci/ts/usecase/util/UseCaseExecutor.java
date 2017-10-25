package com.iris.pci.ts.usecase.util;

import com.iris.pci.ts.usecase.UseCaseException;

public interface UseCaseExecutor {

	<T> T execute(UseCase<T> useCase) throws UseCaseException;
	<T> T executeSoft(UseCase<T> useCase);

}
