package com.wdys.yxlm.repository.impl;

import org.springframework.stereotype.Repository;

import com.wdys.yxlm.core.repository.impl.GenericRepositoryImpl;
import com.wdys.yxlm.domain.New;
import com.wdys.yxlm.repository.NewsRepository;
@Repository
public  class NewRepositoryImpl 
		extends GenericRepositoryImpl<New, Long> 
		implements NewsRepository{
	
}
