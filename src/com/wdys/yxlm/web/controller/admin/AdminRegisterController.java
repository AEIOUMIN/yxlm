package com.wdys.yxlm.web.controller.admin;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wdys.yxlm.core.util.JsonUtil;
import com.wdys.yxlm.core.util.RandomUtil;
import com.wdys.yxlm.domain.User;
import com.wdys.yxlm.service.UserService;

@Controller
@RequestMapping("/yxlm/webmaster/admin")

public class AdminRegisterController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public String index() throws Exception{
		return "yxlm/webmaster/admin/register";	
	}
	@RequestMapping("/validate/mobile")
	@ResponseBody
	public Map<String,Object> validateMoblie(String mobile) throws Exception{
		//判断数据库是否有该手机号
		boolean	Rmobile	=userService.findByMobile(mobile);
		
		return JsonUtil.getResult("", Rmobile);
		
		
	}
	@RequestMapping("/validate/email")
	@ResponseBody
	public Map<String,Object> validateEmail(String email) throws Exception{
		//判断数据库是否有该手机号
		boolean	Remail	=userService.findByEmail(email);
		
		return JsonUtil.getResult("", Remail);
		
		
	}
	@RequestMapping("/valid")
	@ResponseBody
	public Map<String,Object>  validate(User user){
		System.out.println("+++++++++++++++");
		Map<String,Object> result  = null;
		try {
			user.setAccount(user.getMobile());
			String account1 =user.getAccount();
			user.setAccount(user.getEmail());
			String account2 =user.getAccount();
			String account=account1+"\n邮箱登录账号:"+account2;
			userService.add(user);
			result=JsonUtil.getResult(account, true);
			System.out.println("SSSSSSSSSSSSS");
		} catch (Exception e) {
			e.printStackTrace();
			result=JsonUtil.getResult("", false);
			System.out.println("VVVVVVVVVVVVV");
		}
		return result;
		
	}
}
