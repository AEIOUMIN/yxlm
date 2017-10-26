package com.wdys.yxlm.web.controller.admin;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wdys.yxlm.core.util.PagedList;
import com.wdys.yxlm.domain.Picture;
import com.wdys.yxlm.domain.Topic;
import com.wdys.yxlm.domain.User;
import com.wdys.yxlm.service.PictureService;
import com.wdys.yxlm.service.TopicService;
import com.wdys.yxlm.service.UserService;

@Controller
@RequestMapping("/yxlm/webmaster/story")
public class AdminStoryController {
	@Autowired
	private PictureService pictureService;
	@Autowired
	private TopicService topicService;
	@RequestMapping(path = {"/index/{id}","/index"})
	public String video(@PathVariable(required = false) Integer id,
			Model model,HttpSession session) {
		User user =	(User) session.getAttribute("user");
		int pageIndex = id;
		int pageSize = 10;
		List<Topic> topics=topicService.finaAll();
		PagedList<Picture> pictures = pictureService.findPage(pageIndex, pageSize,"");
		model.addAttribute("pictures", pictures);
		model.addAttribute("user", user);
		model.addAttribute("topics", topics);
		return "yxlm/webmaster/story/index";
	}

	@RequestMapping("/create")
	public String create() {
		return "yxlm/webmaster/story/create";
	}

	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable(required = true) Long id, Model model) {
		Picture picture = pictureService.find(id);
		model.addAttribute("picture", picture);
		return "yxlm/webmaster/story/edit";
	}

	@RequestMapping("/save")
	public String save(Picture picture,HttpSession session) throws IllegalStateException, IOException {
		User user=(User) session.getAttribute("user");
		picture.setUser(user);
		System.out.println(picture.getStory());
		System.out.println(picture.getCreateDate());
		if (picture.getId() == null) {
			pictureService.add(picture);
		} else {
			pictureService.update(picture);
		}
		return "redirect:/yxlm/webmaster/story/index/1";
	}

	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable(required = true) Long id) {
		pictureService.delete(id);
		return "redirect:/yxlm/webmaster/story/index/1";
	}
	
	@RequestMapping("/upload")
	@ResponseBody
	public Map<String,Object> upload(MultipartFile photo,HttpServletRequest request) throws IllegalStateException, IOException {
		System.out.println(photo+"----------");
		//文件上传
		String path = request.getServletContext().getRealPath("/upload/story");
		String filename=UUID.randomUUID().toString()+".png";
		photo.transferTo(new File(path+"/"+filename));
		
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("src", request.getContextPath()+"/upload/story/"+filename);
		result.put("pictureImg", "/upload/story/"+filename);
		return result;
	}
	@RequestMapping("/batDelete")
	public String batDelete(Long[] ids){
		System.out.println(ids);
		pictureService.delete(ids);
		return "redirect:/yxlm/webmaster/story/index/1";
		
	}
}
