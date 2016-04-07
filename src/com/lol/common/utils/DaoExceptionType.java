package com.lol.common.utils;

public enum DaoExceptionType {

	UPDATE_ERROR("更新数据出错",1),
	INSERT_ERROR("插入数据出错",2),
	DELETE_ERROR("删除数据出错",3),
	QUERY_ERROR("查询数据出错",4),
	CUDSQL_ERROR("新增、更新或删除错误",5),
	UNKNOW_RUNTIME_ERROR("未知数据库异常",6);
	
	private String errorName;
	private int index;
	
	private DaoExceptionType(String errorName,int index){
		this.errorName = errorName;
		this.index = index;
	}
	
	/**
	 * 根据index来返回相应的错误信息
	 * @param index
	 * @return
	 */
	public String getName(int index){
		for (DaoExceptionType daoExceptionType : DaoExceptionType.values()) {
			if(daoExceptionType.getIndex() == index){
				return daoExceptionType.getErrorName();
			}
		}
		return null;
	}

	public String getErrorName() {
		return errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	
	
	
	
	
}
