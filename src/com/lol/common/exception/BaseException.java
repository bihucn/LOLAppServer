package com.lol.common.exception;

public class BaseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8550565643180454076L;
	
	public BaseException(String message, Throwable throwable){
		super(message, throwable);
	}
	
	public BaseException(String message){
		super(message);
	}
	
	public BaseException(Throwable throwable){
		super(throwable);
	}

}
