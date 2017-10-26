package com.wdys.yxlm.web.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wdys.yxlm.domain.Topic;
import com.wdys.yxlm.service.TopicService;
import com.wdys.yxlm.service.UserService;

@Controller
@RequestMapping("/yxlm/webmaster/growup")
public class AdminIndexController {
	@Autowired
	private UserService userService;
	@Autowired
	private TopicService topicService;
	@RequestMapping("/index/{id}")
	private String index(Model model) throws Exception{
		List<Topic> topics  =topicService.finaAll();
		model.addAttribute("topics", topics);
		return "yxlm/webmaster/index";		
	}
	
	
}
