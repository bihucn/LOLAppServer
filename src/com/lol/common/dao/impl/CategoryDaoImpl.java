package com.lol.common.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.lol.common.dao.CategoryDao;

@Repository
public class CategoryDaoImpl extends BaseDaoImpl implements CategoryDao {

	@Override
	public Object getItem(Class<?> clazz, Serializable id) {
		return queryItem(clazz, id);
		
	}

}
