package com.wdys.yxlm.repository.impl;

import org.springframework.stereotype.Repository;

import com.wdys.yxlm.core.repository.impl.GenericRepositoryImpl;
import com.wdys.yxlm.domain.Video;
import com.wdys.yxlm.repository.VideoRepository;

@Repository
public class VideoRepositoryImpl 
			extends GenericRepositoryImpl<Video, Long>
			implements VideoRepository{

}
