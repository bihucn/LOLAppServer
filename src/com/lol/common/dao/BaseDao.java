package com.lol.common.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * 
 * @author johnzhu
 * @version 0.0.1
 */
public interface BaseDao {
	

	
	public Object queryItem(Class<?> clazz,Serializable id) ;
   

}
