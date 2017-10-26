package com.wdys.yxlm.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wdys.yxlm.core.util.PagedList;
import com.wdys.yxlm.domain.Firend;
import com.wdys.yxlm.domain.Pattern;
import com.wdys.yxlm.domain.Picture;
import com.wdys.yxlm.domain.Topic;
import com.wdys.yxlm.service.FirendService;
import com.wdys.yxlm.service.PatternService;
import com.wdys.yxlm.service.PictureService;
import com.wdys.yxlm.service.TopicService;

@Controller
@RequestMapping("/yxlm/home")
public class StoryController {
	@Autowired
	private TopicService topicService;
	@Autowired
	private PatternService patternService;
	@Autowired
	private FirendService firendService;
	@Autowired
	private PictureService pictureService;
	@RequestMapping(path={"/story","/story/{id}"})
	public String index(@PathVariable(required=false) Integer id, Model model) throws Exception{
		
		List<Topic> topics	=topicService.finaAll();
		List<Pattern> patterns	=patternService.finaAll();
		List<Firend> firends=firendService.finaAll();
		model.addAttribute("topics", topics);
		model.addAttribute("patterns", patterns);
		model.addAttribute("firends", firends);
		
		int pageIndex =id;
		int pageSize =3;
		
		PagedList<Picture> pictures	=pictureService.findPage(pageIndex, pageSize);
		
		model.addAttribute("pictures", pictures);
		return "yxlm/home/story";	
	}
}
