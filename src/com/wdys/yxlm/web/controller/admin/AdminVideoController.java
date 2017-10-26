package com.wdys.yxlm.web.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wdys.yxlm.domain.Topic;
import com.wdys.yxlm.service.TopicService;

@Controller
@RequestMapping("/yxlm/webmaster/video")
public class AdminVideoController {
	@Autowired
	private TopicService topicService;
	@RequestMapping("/index/{id}")
	public String video(Model model) {
		List<Topic> topics  =topicService.finaAll();
		model.addAttribute("topics", topics);
		return "yxlm/webmaster/video/index";
	}
}
