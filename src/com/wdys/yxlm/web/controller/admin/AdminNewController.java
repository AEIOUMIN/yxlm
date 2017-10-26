package com.wdys.yxlm.web.controller.admin;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.wdys.yxlm.core.util.PagedList;
import com.wdys.yxlm.domain.Firend;
import com.wdys.yxlm.domain.New;
import com.wdys.yxlm.domain.Topic;
import com.wdys.yxlm.service.NewService;
import com.wdys.yxlm.service.TopicService;

@Controller
@RequestMapping("/yxlm/webmaster/new")
public class AdminNewController {
	@Autowired
	private NewService newService;
	@Autowired
	private TopicService topicService;
	@RequestMapping(path={"/index/{id}","/index"})
	public String video(@PathVariable Integer id,Model model) {
		int pageIndex = id;
		int pageSize =6;
		PagedList<New> news =	newService.findPage(pageIndex, pageSize);
		model.addAttribute("news", news);
		
		return "yxlm/webmaster/new/index";
	}
	@RequestMapping("/create")
	public String create(){
		
		return "yxlm/webmaster/new/create";
		
	}
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable(required=true) Long id,Model model){
		New newy =	newService.find(id);
		Topic topic=newy.getTopic();
		model.addAttribute("newy", newy);
		model.addAttribute("topic", topic);
	return "yxlm/webmaster/new/edit";
		
	}
	@RequestMapping("/save")
	public String save(New newy) {
		System.out.println("XXXXXXXXXX");
		if(newy.getId()==null){
			newService.add(newy);
		}else{
			newService.update(newy);
		}
		
		return "redirect:/yxlm/webmaster/new/index/1";
		
	}
	@RequestMapping("/upload")
	@ResponseBody
	public Map<String,Object> upload(MultipartFile photo,HttpServletRequest request) throws IllegalStateException, IOException {
		//文件上传
		String path = request.getServletContext().getRealPath("/upload");
		String filename=UUID.randomUUID().toString()+".png";
		photo.transferTo(new File(path+"/"+filename));
		
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("src", request.getContextPath()+"/upload/"+filename);
		result.put("imageUrl", "/upload/"+filename);
		return result;
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable(required=true) Long id){
		newService.deleteByNewId(id);
		System.out.println(id+"----new-");
		return "redirect:/yxlm/webmaster/new/index/1";
		
	}
	@RequestMapping("/batDelete")
	public String batDelete(Long[] ids){
		newService.deleteByNewIds(ids);
		return "redirect:/yxlm/webmaster/new/index/1";
		
	}
	
	
}
