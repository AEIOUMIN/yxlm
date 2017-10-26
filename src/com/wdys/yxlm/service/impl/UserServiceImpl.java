package com.wdys.yxlm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdys.yxlm.core.service.impl.GenericServiceImpl;
import com.wdys.yxlm.domain.User;
import com.wdys.yxlm.repository.UserRepository;
import com.wdys.yxlm.service.UserService;
@Service
public class UserServiceImpl 
	   extends GenericServiceImpl<User, Long> 
	   implements UserService{
	@Autowired
	private UserRepository userRepository;
	@Override
	public User login(String account, String password) {
		User user = null;
		if(account.indexOf("@")>=0){
			user =findUserByAEmail(account);
		}else{
			 user=findUserByAMobile(account);
		}
		return user;
	}
	private User findUserByAMobile(String account) {
		return	genericRepository.find(" where u.mobile =?0", account);
		
	}
	private User findUserByAEmail(String account) {
		return	genericRepository.find(" where u.email =?0", account);
	}
	@Override
	public boolean findByMobile(String mobile) {
		User user	=userRepository.find(" where u.mobile =?0", mobile);
		if(user==null){
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public boolean findByEmail(String email) {
		User user	=userRepository.find(" where u.email =?0", email);
		if(user==null){
			return true;
		}else{
			return false;
		}
	}

}
