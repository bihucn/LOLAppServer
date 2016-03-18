package com.lol.common.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lol.common.dao.CategoryDao;
import com.lol.common.service.CategoryService;

@Service
@Transactional()
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public Object getItem(Class<?> clazz, Serializable id) {
		
		return categoryDao.getItem(clazz, id);
	}

}
