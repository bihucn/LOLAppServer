package com.lol.common.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class HeroDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer heroId;
	
 	private String heroName;
 	
 	private String heroFullName;
	
 	private String headImgSrc;
	
 	private Float price;
	
 	private Short canConvert;
	
 	private Integer points;
	
 	private Integer coins;
	
 	private Short index;
 	
 	private String categoryCode;
 	
 	@JsonIgnore
 	private List<CategoryDto> categories;
 	
 	public HeroDto(){}
 	
 	public HeroDto(Integer heroId, String heroName, String heroFullName,
			String headImgSrc, Float price, Short canConvert, Integer points,
			Integer coins){
 		super();
		this.heroId = heroId;
		this.heroName = heroName;
		this.heroFullName = heroFullName;
		this.headImgSrc = headImgSrc;
		this.price = price;
		this.canConvert = canConvert;
		this.points = points;
		this.coins = coins;
 	}

	public Integer getHeroId() {
		return heroId;
	}

	public void setHeroId(Integer heroId) {
		this.heroId = heroId;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroFullName() {
		return heroFullName;
	}

	public void setHeroFullName(String heroFullName) {
		this.heroFullName = heroFullName;
	}

	public String getHeadImgSrc() {
		return headImgSrc;
	}

	public void setHeadImgSrc(String headImgSrc) {
		this.headImgSrc = headImgSrc;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Short getCanConvert() {
		return canConvert;
	}

	public void setCanConvert(Short canConvert) {
		this.canConvert = canConvert;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getCoins() {
		return coins;
	}

	public void setCoins(Integer coins) {
		this.coins = coins;
	}

	public Short getIndex() {
		return index;
	}

	public void setIndex(Short index) {
		this.index = index;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public List<CategoryDto> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryDto> categories) {
		this.categories = categories;
	}
 	
 	
 	

}
