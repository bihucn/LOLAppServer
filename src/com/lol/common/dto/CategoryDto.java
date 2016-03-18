package com.lol.common.dto;

import java.io.Serializable;

public class CategoryDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer categoryId;
	
 	private String categoryName;
	
 	private Short categoryType;
 	
 	private String categoryCode;
 	
 	private String categoryFace;
	
	public CategoryDto(){}
	
	public CategoryDto(Integer categoryId, String categoryName,
			String categoryCode) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryCode = categoryCode;
	}
	
	

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Short getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(Short categoryType) {
		this.categoryType = categoryType;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryFace() {
		return categoryFace;
	}

	public void setCategoryFace(String categoryFace) {
		this.categoryFace = categoryFace;
	}
 	
 	
	

}
