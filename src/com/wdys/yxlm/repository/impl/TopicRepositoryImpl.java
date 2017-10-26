package com.wdys.yxlm.repository.impl;

import org.springframework.stereotype.Repository;

import com.wdys.yxlm.core.repository.impl.GenericRepositoryImpl;
import com.wdys.yxlm.domain.Topic;
import com.wdys.yxlm.repository.TopicRepository;

@Repository
public class TopicRepositoryImpl 
			extends GenericRepositoryImpl<Topic, Long>
			implements TopicRepository{
	
}
