package com.iris.pci.ts.infrastructure.data.jpa.base;

public abstract class BaseJpaRepository {

	public BaseJpaRepository() {
		super();
	}

	public <T> void add(T t) {
		Jpa.getManager().persist( t );
	}

	public <T> void remove(T t) {
		Jpa.getManager().remove( t );
	}

}