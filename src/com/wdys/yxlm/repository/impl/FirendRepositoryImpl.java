package com.wdys.yxlm.repository.impl;

import org.springframework.stereotype.Repository;

import com.wdys.yxlm.core.repository.impl.GenericRepositoryImpl;
import com.wdys.yxlm.domain.Firend;
import com.wdys.yxlm.repository.FirendRepository;

@Repository
public class FirendRepositoryImpl 
			extends GenericRepositoryImpl<Firend, Long>
			implements FirendRepository{

}
