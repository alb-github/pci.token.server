package com.iris.pci.ts.usecase.util;

import com.iris.pci.ts.usecase.UseCaseException;

public interface UseCase<T> {
	
	T execute() throws UseCaseException;

}
