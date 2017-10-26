package com.wdys.yxlm.web.controller.admin;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wdys.yxlm.domain.User;
import com.wdys.yxlm.service.UserService;

@Controller
@RequestMapping("/yxlm/webmaster")
public class AdminController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login() throws Exception{
		
		return "yxlm/webmaster/login";
		
	}
	@RequestMapping("/validate")
	public String validate(String account,String password,Model model,HttpSession session) throws Exception{
		System.out.println(account+"-------"+password);
		User user=	userService.login(account,password);
		if(user!=null){
			session.setAttribute("user", user);
			
			return "redirect:/yxlm/webmaster/growup/index/1";
		}else{
			System.out.println("error"+"-----------");
			model.addAttribute("error", "用户名或者密码错误");
			return "yxlm/webmaster/login";
		}
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception{
		session.invalidate();
		
		return "redirect:/login";
		
	}
}
