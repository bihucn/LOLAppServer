package com.lol.common.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lol.common.dto.CategoryDto;
import com.lol.common.service.CategoryService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MyTestDao {
	
	
	@Autowired
	private CategoryService categoryService;
	
	@Test
	public void testGet() throws Exception {
		
		List<CategoryDto> categoryDtosByCategoryType = categoryService.getCategoryDtosByCategoryType((short) 1);
		for (CategoryDto categoryDto : categoryDtosByCategoryType) {
			System.out.println(categoryDto.getCategoryName());
		}
	}
	
	

}
