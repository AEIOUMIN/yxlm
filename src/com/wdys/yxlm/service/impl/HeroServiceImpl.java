package com.wdys.yxlm.service.impl;

import org.springframework.stereotype.Service;

import com.wdys.yxlm.core.service.impl.GenericServiceImpl;
import com.wdys.yxlm.domain.Hero;
import com.wdys.yxlm.service.HeroService;

@Service
public class HeroServiceImpl 
			extends GenericServiceImpl<Hero, Long>
			implements HeroService{

}
