package com.wdys.yxlm.repository.impl;

import org.springframework.stereotype.Repository;

import com.wdys.yxlm.core.repository.impl.GenericRepositoryImpl;
import com.wdys.yxlm.domain.Pattern;
import com.wdys.yxlm.repository.PatternRepository;

@Repository
public class PatternRepositoryImpl 
			extends GenericRepositoryImpl<Pattern, Long>
			implements PatternRepository{

}
