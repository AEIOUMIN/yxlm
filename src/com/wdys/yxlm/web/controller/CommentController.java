package com.wdys.yxlm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wdys.yxlm.core.util.PagedList;
import com.wdys.yxlm.domain.Comment;
import com.wdys.yxlm.domain.Firend;
import com.wdys.yxlm.domain.New;
import com.wdys.yxlm.service.CommentService;
import com.wdys.yxlm.service.FirendService;
import com.wdys.yxlm.service.GamerecordService;
import com.wdys.yxlm.service.NewService;

@Controller
@RequestMapping("/yxlm/home")
public class CommentController {
	@Autowired
	private CommentService commentService;
	@Autowired
	private NewService newService;
	@Autowired
	private FirendService firendService;
	@Autowired
	private GamerecordService gamerecordService;
	@RequestMapping(path={"/comment/1","/comment/{id}"})
	public String index(Model model) throws Exception{
		int pageIndex =1;
		int pageSize =5;
		New news=	newService.find(1L);
		PagedList<Comment> comments=commentService.findPageByFirendNewGamer(pageIndex, pageSize,1L,1L,1L,1L);
		model.addAttribute("comments", comments);
		model.addAttribute("news", news);
		return "yxlm/home/comment";
		
	}
	@RequestMapping("/list/{id}/index")
	public String list(@PathVariable Long id,@PathVariable Integer index,
						Long firendId,Long newId,Long gamerecordId,
						Model model) throws Exception{
		int pageIndex =index;
		int pageSize =5;
		New news=	newService.find(newId);
		PagedList<Comment> comments=commentService.findPageByFirendNewGamer(pageIndex, pageSize,1L,1L,1L,1L);
		model.addAttribute("comments", comments);
		model.addAttribute("news", news);
		return "yxlm/home/comment";
	}
	
}
