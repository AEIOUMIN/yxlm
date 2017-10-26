package com.wdys.yxlm.repository.impl;

import org.springframework.stereotype.Repository;

import com.wdys.yxlm.core.repository.impl.GenericRepositoryImpl;
import com.wdys.yxlm.domain.Area;
import com.wdys.yxlm.repository.AreaRepository;
@Repository
public class AreaRepositoryImpl 
			extends GenericRepositoryImpl<Area, Long>
			implements AreaRepository{

}
