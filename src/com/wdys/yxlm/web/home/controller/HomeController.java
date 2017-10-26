package com.wdys.yxlm.web.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wdys.yxlm.domain.Firend;
import com.wdys.yxlm.domain.Pattern;
import com.wdys.yxlm.domain.Topic;
import com.wdys.yxlm.service.FirendService;
import com.wdys.yxlm.service.PatternService;
import com.wdys.yxlm.service.TopicService;

@Controller
public class HomeController {
	@Autowired
	private TopicService topicService;
	@Autowired
	private PatternService patternService;
	@Autowired
	private FirendService firendService;
	@RequestMapping(path={"/","/index"})
	public String index(Model model) throws Exception{
		
		List<Topic> topics	=topicService.finaAll();
		List<Firend> firends=firendService.finaAll();
		List<Pattern> patterns	=patternService.finaAll();
		model.addAttribute("topics", topics);
		model.addAttribute("patterns", patterns);
		model.addAttribute("firends", firends);
		return "yxlm/home/index";	
	}
}
