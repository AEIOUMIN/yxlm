package com.wdys.yxlm.repository.impl;

import org.springframework.stereotype.Repository;

import com.wdys.yxlm.core.repository.impl.GenericRepositoryImpl;
import com.wdys.yxlm.domain.Gamerecord;
import com.wdys.yxlm.repository.GamerecordRepository;

@Repository
public class GamerecordRepositoryImpl 
			extends GenericRepositoryImpl<Gamerecord, Long>
			implements GamerecordRepository{

}
