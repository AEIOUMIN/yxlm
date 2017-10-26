package com.wdys.yxlm.service.impl;

import org.springframework.stereotype.Service;

import com.wdys.yxlm.core.service.impl.GenericServiceImpl;
import com.wdys.yxlm.domain.Video;
import com.wdys.yxlm.service.VideoService;

@Service
public class VideoServiceImpl 
		extends GenericServiceImpl<Video, Long>
		implements VideoService{

}
