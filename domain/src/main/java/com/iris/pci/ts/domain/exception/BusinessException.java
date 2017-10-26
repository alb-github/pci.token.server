package com.iris.pci.ts.domain.exception;

public class BusinessException extends Exception {

	public BusinessException() {
		super();
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}

	public static void isNull(Object o) throws BusinessException {
		isNull( o == null, o.getClass().getName() + " cannot be null here" );
	}

	public static void isNull(Object o, String msg) throws BusinessException {
		isTrue( o == null, msg );
	}

	public static void isNotNull(Object o, String errorMsg) throws BusinessException {
		isTrue( o != null, errorMsg); 
	}

	public static void isNotNull(Object o) throws BusinessException {
		isTrue( o != null, o.getClass().getName() + " cannot be null here"); 
	}

	public static void isFalse(boolean condition) throws BusinessException {
		isTrue( ! condition, "Invalid assertion");
	}

	public static void isFalse(boolean condition, String errorMsg) throws BusinessException {
		isTrue( ! condition, errorMsg);
	}

	public static void isTrue(boolean condition) throws BusinessException {
		isTrue(condition, "Invalid assertion");
	}

	public static void isTrue(boolean condition, String errorMsg) throws BusinessException {
		if ( condition == true ) return;
		throwBusinessException(errorMsg);
	}

	public static void fail() throws BusinessException {
		throwBusinessException( "Business assertion failed!" );
	}

	public static void fail(String msg) throws BusinessException {
		throwBusinessException( msg );
	}

	private static void throwBusinessException(String errorMsg) throws BusinessException {
		throw new BusinessException( errorMsg );
	}

}
