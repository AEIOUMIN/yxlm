package com.wdys.yxlm.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.wdys.yxlm.core.repository.impl.GenericRepositoryImpl;
import com.wdys.yxlm.domain.Picture;
import com.wdys.yxlm.repository.PictureRepository;
@Repository
public class PictureRepositoryImpl 
			extends GenericRepositoryImpl<Picture, Long>
			implements PictureRepository{
	
	@SuppressWarnings("unchecked")
	public List<String> findByPictureImg(){
		Session session =sessionFactory.getCurrentSession();
		
		String hql ="select pictureImg from Picture";
		Query<String> query = session.createQuery(hql);
		
		return query.list();
		
	}
}
