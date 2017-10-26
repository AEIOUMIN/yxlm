package com.wdys.yxlm.web.controller.admin;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wdys.yxlm.core.util.PagedList;
import com.wdys.yxlm.domain.Comment;
import com.wdys.yxlm.domain.Firend;
import com.wdys.yxlm.domain.Gamerecord;
import com.wdys.yxlm.domain.New;
import com.wdys.yxlm.domain.Topic;
import com.wdys.yxlm.service.CommentService;
import com.wdys.yxlm.service.FirendService;
import com.wdys.yxlm.service.GamerecordService;
import com.wdys.yxlm.service.NewService;
import com.wdys.yxlm.service.TopicService;

@Controller
@RequestMapping("/yxlm/webmaster/comment")
public class AdminCommentController {
	@Autowired
	private CommentService commentService;
	@Autowired
	private FirendService firendService;
	@Autowired
	private NewService newService;
	//查询某个玩家朋友（firend）发表的某个游戏记录（gameId）或者某个新闻(newId)所对应的评论
	@RequestMapping(path={"/index/{id}","/index"})
	public String video(@PathVariable Integer id ,
						@PathVariable(required=false)Long newId,
						@PathVariable(required=false)Long firendId,
						@PathVariable(required=false)Long gameId,
						Model model) {
		if(newId!=null){
			New newOne=	newService.find(newId);
			model.addAttribute("newOne", newOne);
		}
		
		if(firendId!=null){
		Firend firend=	firendService.find(firendId);
			model.addAttribute("firend", firend);
		}
		int pageIndex =id;
		int pageSize =10;
		  newId =1L;
		  firendId=1L;
		 gameId =1L;
		PagedList<Comment> comments =commentService.findByNewAndGameAndUser(pageIndex,pageSize,newId,firendId,gameId);
		
		model.addAttribute("comments", comments);
		
		return "yxlm/webmaster/comment/index";
	}
	@RequestMapping("/create")
	public String create(){
		return "yxlm/webmaster/comment/create";
		
	}
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable(required=true) Long id,Model model){
		Comment comment =	commentService.find(id);
		model.addAttribute("comment", comment);
		return "yxlm/webmaster/comment/edit";
		
	}
	@RequestMapping("/save")
	public String save(Comment comment){
		if(comment.getId()==null){
			comment.setCreateDate(new Date());
			commentService.add(comment);
		}else{
			commentService.update(comment);
		}
		return "redirect:/yxlm/webmaster/comment/index/1";
		
	}
	@RequestMapping("/delete/{id}")
	public String delete(Long id){
		commentService.delete(id);
		return "redirect:/yxlm/webmaster/comment/index/1";
		
	}
	@RequestMapping("/batDelete")
	public String batDelete(Long[] ids){
		commentService.delete(ids);
		return "redirect:/yxlm/webmaster/comment/index/1";
		
	}
}
