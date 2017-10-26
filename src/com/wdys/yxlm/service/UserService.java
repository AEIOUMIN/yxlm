package com.wdys.yxlm.service;

import com.wdys.yxlm.core.service.GenericService;
import com.wdys.yxlm.domain.User;

public interface UserService extends GenericService<User, Long>{

	public User login(String account, String password);

	public boolean findByMobile(String mobile);

	public boolean findByEmail(String email);
	
}
