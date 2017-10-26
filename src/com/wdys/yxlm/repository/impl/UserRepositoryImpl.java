package com.wdys.yxlm.repository.impl;

import org.springframework.stereotype.Repository;

import com.wdys.yxlm.core.repository.impl.GenericRepositoryImpl;
import com.wdys.yxlm.domain.User;
import com.wdys.yxlm.repository.UserRepository;

@Repository
public  class UserRepositoryImpl 
		extends GenericRepositoryImpl<User, Long> 
	    implements UserRepository{

}
