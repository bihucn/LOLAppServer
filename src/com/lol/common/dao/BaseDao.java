package com.lol.common.dao;

import java.io.Serializable;


/**
 * 
 * @author johnzhu
 * @version 0.0.1
 */
public interface BaseDao {
	
	public Object queryItem(Class<?> clazz,Serializable id);
	

}
