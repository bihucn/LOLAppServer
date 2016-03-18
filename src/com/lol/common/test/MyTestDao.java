package com.lol.common.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lol.common.entity.Category;
import com.lol.common.service.CategoryService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MyTestDao {
	
	
	@Autowired
	private CategoryService categoryService;
	
	@Test
	public void testGet() throws Exception {
		Category cate = new Category();
		
		
		Category item = (Category) categoryService.getItem(cate.getClass(), 2);
		System.out.println(item.getCategoryName());
	}
	
	

}
