package com.wdys.yxlm.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wdys.yxlm.core.util.PagedList;
import com.wdys.yxlm.domain.Firend;
import com.wdys.yxlm.domain.New;
import com.wdys.yxlm.domain.Pattern;
import com.wdys.yxlm.domain.Topic;
import com.wdys.yxlm.service.FirendService;
import com.wdys.yxlm.service.NewService;
import com.wdys.yxlm.service.PatternService;
import com.wdys.yxlm.service.TopicService;

@Controller
@RequestMapping("/yxlm/home")
public class NewController {
	@Autowired
	private TopicService topicService;
	@Autowired
	private PatternService patternService;
	@Autowired
	private FirendService firendService;
	@Autowired
	private NewService newService;
	@RequestMapping(path={"/new","/new/{id}"})
	public String index(@PathVariable(required=false) Integer id,Long topicId,Model model) throws Exception{
		List<Topic> topics	=topicService.finaAll();
		List<Pattern> patterns	=patternService.finaAll();
		List<Firend> firends=firendService.finaAll();
		model.addAttribute("topics", topics);
		model.addAttribute("patterns", patterns);
		model.addAttribute("firends", firends);
		
		return "yxlm/home/new";
		
	}
	@RequestMapping("/newShow/{topicId}/{pageIndex}")
	public String newShow(@PathVariable(required=false) Long topicId ,
						@PathVariable(required=false) Integer pageIndex, 
						Model model){
		int pageSize =3;
		
		PagedList<New> news =	newService.findPage(pageIndex, pageSize, topicId);
		
		model.addAttribute("news", news);
		model.addAttribute("topicId", topicId);
		return "yxlm/home/show";
		
	}
}
