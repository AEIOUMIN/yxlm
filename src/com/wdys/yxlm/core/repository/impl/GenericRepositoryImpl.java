package com.wdys.yxlm.core.repository.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wdys.yxlm.core.repository.GenericRepository;
import com.wdys.yxlm.core.util.PagedList;
/**
 * Generic实现
 * @author Administrator
 *
 * @param <T>
 * @param <PK>
 */

public abstract class GenericRepositoryImpl<T,PK extends Serializable> implements GenericRepository<T, PK>{
	@Autowired
	protected SessionFactory sessionFactory;
	Class<T> clazz;
	//通过反射获取类名
	@SuppressWarnings("unchecked")
	public GenericRepositoryImpl(){
	ParameterizedType pt =	(ParameterizedType) this.getClass().getGenericSuperclass();
		clazz =(Class<T>) pt.getActualTypeArguments()[0];
	}
	@Override
	public void add(T t) {
		sessionFactory.getCurrentSession().save(t);
		
	}

	@Override
	public void update(T t) {
		sessionFactory.getCurrentSession().merge(t);	
	}

	@Override
	public void delete(PK id) {
		T t=	sessionFactory.getCurrentSession().get(clazz, id);
		if(t!=null){
			sessionFactory.getCurrentSession().delete(t);
		}
		
	}

	@Override
	public void delete(PK[] ids) {
		
		for(PK id:ids){
			delete(id);
		}
		
	}

	@Override
	public T find(PK id) {
		return	sessionFactory.getCurrentSession().get(clazz, id);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T find(String where, Object... params) {
		Session session=	sessionFactory.getCurrentSession();
		String hql =" from "+clazz.getSimpleName()+" as u " +where;
		Query<?> query = session.createQuery(hql);
		if(params!=null){
		for(int i=0;i<params.length;i++){
			query.setParameter(i, params[i]);
		}
		}
		return (T) query.uniqueResult();
	}

	@Override
	public Long totalCount(String where, Object... params) {
		Session session=	sessionFactory.getCurrentSession();
		String hql =" select count(id) from "+clazz.getSimpleName()+" as u " +where;
		Query<?> query = session.createQuery(hql);
		if(params!=null){
			int i=0;
			for(Object param:params){
				query.setParameter(i++, param);
			}
		}
		
		return (Long) query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> finaAll() {
		Session session=	sessionFactory.getCurrentSession();
		String hql="from "+clazz.getSimpleName();
		Query<T> query = session.createQuery(hql);
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findList(String where, Object... params) {
		Session session=	sessionFactory.getCurrentSession();
		String hql =" from "+clazz.getSimpleName()+" as u " +where;
		Query<T> query = session.createQuery(hql);
		if(params!=null){
			int i=0;
			for(Object param:params){
				query.setParameter(i++, param);
			}
		}
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findPage(int pageIndex, int pageSize, String where, Object... params) {
		Session session=	sessionFactory.getCurrentSession();
		String hql =" from "+clazz.getSimpleName()+" as u " +where;
		Query<T> query = session.createQuery(hql);
		if(params!=null){
			int i=0;
			for(Object param:params){
				query.setParameter(i++, param);
			}
		}
		return 	query.setFirstResult((pageIndex-1)*pageSize)
				.setMaxResults(pageSize)
				.list();
	}
	
}
