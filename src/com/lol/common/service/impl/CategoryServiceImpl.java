package com.lol.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lol.common.dao.CategoryDao;
import com.lol.common.dto.CategoryDto;
import com.lol.common.service.CategoryService;

@Service
@Transactional()
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<CategoryDto> getCategoryDtosByCategoryType(Short categoryType) {
		
		return this.categoryDao.getCategoryDtosByCategoryType(categoryType);
	}
	

}
