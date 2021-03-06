package com.lol.common.dao;

import java.util.List;

import com.lol.common.dto.CategoryDto;

public interface CategoryDao extends BaseDao{

	/**
	 * 通过categoryType来获取相对应的所有category
	 * @param categoryType
	 * @return 与传入的categoryType相对应的category
	 */
	public List<CategoryDto> getCategoryDtosByCategoryType(Short categoryType);
	
}
