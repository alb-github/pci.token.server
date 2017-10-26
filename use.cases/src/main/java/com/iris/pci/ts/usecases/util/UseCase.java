package com.iris.pci.ts.usecases.util;

import com.iris.pci.ts.usecases.UseCaseException;

public interface UseCase<T> {
	
	T execute() throws UseCaseException;

}
