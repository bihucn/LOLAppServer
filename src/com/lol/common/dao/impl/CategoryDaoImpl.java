package com.lol.common.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lol.common.dao.CategoryDao;
import com.lol.common.dto.CategoryDto;

@Repository
public class CategoryDaoImpl extends BaseDaoImpl implements CategoryDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<CategoryDto> getCategoryDtosByCategoryType(Short categoryType) {
		
		String hql = "select NEW com.lol.common.dto.CategoryDto(c.categoryId, c.categoryName,c.categoryCode,c.categoryFace)"
				+ " FROM Category c WHERE c.categoryType="+categoryType;
		
		
		return (List<CategoryDto>) this.findByHql(hql,null);
	}

}
