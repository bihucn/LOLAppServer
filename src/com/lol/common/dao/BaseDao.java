package com.lol.common.dao;

import java.util.List;
import java.util.Map;


/**
 * 
 * @author johnzhu
 * @version 0.0.1
 */
public interface BaseDao {
	

	
	public List<?> findByHql(final String hql, final Map<String, Object> map);
   

}
