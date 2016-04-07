package com.lol.common.exception;

import com.lol.common.utils.DaoExceptionType;

public class DaoException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -134219155136975610L;
	
	private DaoExceptionType daoExceptionType = DaoExceptionType.UNKNOW_RUNTIME_ERROR;

	public DaoException(String message) {
		super(message);
	}
	
	public DaoException(String message, Throwable throwable) {
		super(message,throwable);
	}
	
	public DaoException(Throwable throwable) {
		super(throwable);
	}
	
	public DaoException(DaoExceptionType daoExceptionType,String message) {
		super(message);
		this.daoExceptionType=daoExceptionType;
 	}
	
	public DaoException(DaoExceptionType daoExceptionType,Throwable cause) {
		super(cause);
		this.daoExceptionType=daoExceptionType;
 	}
	
	public DaoException(DaoExceptionType daoExceptionType,String message,Throwable cause) {
		super(message,cause);
		this.daoExceptionType=daoExceptionType;
 	}

	public DaoExceptionType getDaoExceptionType() {
		return daoExceptionType;
	}
	
	

}
