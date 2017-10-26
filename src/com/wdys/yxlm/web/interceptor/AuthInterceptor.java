package com.wdys.yxlm.web.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.wdys.yxlm.domain.Hero;
import com.wdys.yxlm.domain.Topic;
import com.wdys.yxlm.domain.User;
import com.wdys.yxlm.service.HeroService;
import com.wdys.yxlm.service.TopicService;
import com.wdys.yxlm.service.UserService;

public class AuthInterceptor implements HandlerInterceptor{
	@Autowired
	private TopicService topicService;
	@Autowired
	private UserService userService;
	@Autowired
	private HeroService heroService;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		String uri = request.getRequestURI();
		// 如果是资源文件或者是登录、退出则放行
		System.out.println(uri+"-----uri-----");
		if(uri.indexOf("login")>0 || uri.indexOf("logout")>0 || uri.indexOf("validate")>0 ||uri.indexOf("assets")>0){
			
			return true;
		}
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			System.out.println("++++++++++++++++++++++++");
			response.sendRedirect(request.getContextPath()+"/index");
			return false;
		}else{
			List<Topic> topics  =topicService.finaAll();
			request.setAttribute("topics", topics);
			List<User> users  =userService.finaAll();
			request.setAttribute("users", users);
			List<Hero> heros  =heroService.finaAll();
			request.setAttribute("heros", heros);
			return true;
		}
		
	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		
		
	}



}
