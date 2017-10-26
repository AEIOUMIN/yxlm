package com.wdys.yxlm.repository.impl;

import org.springframework.stereotype.Repository;

import com.wdys.yxlm.core.repository.impl.GenericRepositoryImpl;
import com.wdys.yxlm.domain.Hero;
import com.wdys.yxlm.repository.HeroRepository;

@Repository
public class HeroRepositoryImpl 
			extends GenericRepositoryImpl<Hero, Long>
			implements HeroRepository{

}
