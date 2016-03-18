package com.lol.common.dao;

import java.io.Serializable;

public interface CategoryDao extends BaseDao{

	
	public Object getItem(Class<?> clazz, Serializable id);
	
}
