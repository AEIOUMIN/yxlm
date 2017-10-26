package com.wdys.yxlm.web.home.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wdys.yxlm.core.util.JsonUtil;
import com.wdys.yxlm.domain.Topic;
import com.wdys.yxlm.service.TopicService;

@Controller
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	private TopicService topicService;
	@RequestMapping("/demo")
	public String demo(){
		return "demo/demo";
	}
	@RequestMapping("/details")
	@ResponseBody
	public Topic details( Topic topic) throws Exception{
		System.out.println(topic.getId());
		System.out.println(topic.getTopicName());
		return topicService.find(topic.getId());
		
		
		
	}
}
