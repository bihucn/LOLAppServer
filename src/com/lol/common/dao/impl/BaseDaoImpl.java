package com.lol.common.dao.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.lol.common.dao.BaseDao;
import com.lol.common.exception.DaoException;
import com.lol.common.utils.DaoExceptionType;



@Repository
public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao {

	
	 @Resource(name = "sessionFactory")
	 public void setSuperSessionFactory(SessionFactory sessionFactory) {
		 super.setSessionFactory(sessionFactory);
	 }

	@Override
	public List<?> findByHql(final String hql, final Map<String, Object> map) {
		
		List<?> result = null;
		try {
			
			result = (List<?>) getHibernateTemplate().execute(new HibernateCallback<Object>() {

				@Override
				public Object doInHibernate(Session session) throws HibernateException {
					
					Query query = session.createQuery(hql);
					if(map!=null){
						Iterator<String> keys = map.keySet().iterator();
						while(keys.hasNext()){
							String next = keys.next();
							query.setParameter(next.toString(), map.get(next));
						}
					}
					
					
					return query.list();
				}
				
			});

		} catch (RuntimeException e) {
			e.printStackTrace();
			throw new DaoException(DaoExceptionType.QUERY_ERROR, e);
		}
		return result;
	}
	
	





}
