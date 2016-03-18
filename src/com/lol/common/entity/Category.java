package com.lol.common.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="category")
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 分类类型-英雄分类
	 */
	public static final short CATEGORY_TYPE_HERO=1;
	
	/**
	 * 分类类型-图片分类
	 */
	public static final short CATEGORY_TYPE_PIC=2;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="category_id")
	private Integer categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	@Column(name="category_type")
	private Short categoryType;
	
	@Column(name="category_code")
	private String categoryCode;
	
	@Column(name="category_face")
	private String categoryFace;

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
