package com.iris.pci.ts.usecase;

import com.iris.pci.ts.domain.exception.BusinessException;

public class UseCaseException extends Exception {
	private static final long serialVersionUID = 1L;

	public UseCaseException() {
	}

	public UseCaseException(String arg0) {
		super(arg0);
	}

	public UseCaseException(Throwable arg0) {
		super(arg0);
	}

	public UseCaseException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UseCaseException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public static void isNull(Object o) throws UseCaseException {
		isNull( o == null, o.getClass().getName() + " cannot be null here" );
	}

	public static void isNull(Object o, String msg) throws UseCaseException {
		isTrue( o == null, msg );
	}

	public static void isNotNull(Object o, String errorMsg) throws UseCaseException {
		isTrue( o != null, errorMsg); 
	}

	public static void isNotNull(Object o) throws UseCaseException {
		isTrue( o != null, o.getClass().getName() + " cannot be null here"); 
	}

	public static void isFalse(boolean condition) throws UseCaseException {
		isTrue( ! condition, "Invalid assertion");
	}

	public static void isFalse(boolean condition, String errorMsg) throws UseCaseException {
		isTrue( ! condition, errorMsg);
	}

	public static void isTrue(boolean condition) throws UseCaseException {
		isTrue(condition, "Invalid assertion");
	}

	public static void isTrue(boolean condition, String errorMsg) throws UseCaseException {
		if ( condition == true ) {
			return;
		}
		throwUseCaseException(errorMsg);
	}

	public static void fail() throws UseCaseException {
		throwUseCaseException( "Business assertion failed!" );
	}

	public static void fail(String msg) throws UseCaseException {
		throwUseCaseException( msg );
	}

	private static void throwUseCaseException(String errorMsg) throws UseCaseException {
		throw new UseCaseException( errorMsg );
	}

	public static void throwFrom(BusinessException bex) throws UseCaseException {
		throw new UseCaseException( bex );
	}

}
