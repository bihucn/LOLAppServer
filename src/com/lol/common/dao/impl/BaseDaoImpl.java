package com.lol.common.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.lol.common.dao.BaseDao;



@Repository
public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao {

	
	 @Resource(name = "sessionFactory")
	 public void setSuperSessionFactory(SessionFactory sessionFactory) {
		 super.setSessionFactory(sessionFactory);
	 }
	
	@Override
	public Object queryItem(Class<?> clazz,Serializable id) {
		Object o = null;
        try
        {
            o = getHibernateTemplate().get(clazz, id);
        }
        catch (RuntimeException e)
        {
            e.printStackTrace();
          
        }
        return o;
		
	}




}
