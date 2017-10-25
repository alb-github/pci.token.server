package com.iris.pci.ts.repositories;

public interface Repository {
	<T> void add(T t);
	<T> void remove(T t);
}
