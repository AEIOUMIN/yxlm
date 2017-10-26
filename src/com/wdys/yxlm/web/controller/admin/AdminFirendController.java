package com.wdys.yxlm.web.controller.admin;

import java.io.File;
import java.io.IOException;
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
import com.wdys.yxlm.domain.User;
import com.wdys.yxlm.service.FirendService;
import com.wdys.yxlm.service.UserService;

	

@Controller
@RequestMapping("/yxlm/webmaster/firend")
public class AdminFirendController {
	@Autowired
	private FirendService firendService;
	
	@RequestMapping(path={"/index/{id}","/index"})
	public String firend(@PathVariable Integer id  ,Model model) {
		
		int pageIndex =id;
		int pageSize =5;
		PagedList<Firend> firends = firendService.findPage(pageIndex, pageSize);
		model.addAttribute("firends", firends);
		return "yxlm/webmaster/firend/index";
	}
	@RequestMapping("/create")
	public String create(){
		
		return "yxlm/webmaster/firend/create";
		
	}
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable(required=true) Long id,Model model){
	Firend firend =	firendService.find(id);
		model.addAttribute("firend", firend);
	return "yxlm/webmaster/firend/edit";
		
	}
	@RequestMapping("/save")
	public String save(Firend firend) throws IllegalStateException, IOException{
		if(firend.getId()==null){
			firend.setAccount(firend.getMobile());
			firendService.add(firend);
		}else{
			firendService.update(firend);
		}
		
		return "redirect:/yxlm/webmaster/firend/index/1";
		
	}
	@RequestMapping("/upload")
	@ResponseBody
	public Map<String,Object> upload(MultipartFile photo,HttpServletRequest request) throws IllegalStateException, IOException {
		System.out.println(photo+"----------");
		//文件上传
		String path = request.getServletContext().getRealPath("/upload");
		String filename=UUID.randomUUID().toString()+".png";
		photo.transferTo(new File(path+"/"+filename));
		
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("src", request.getContextPath()+"/upload/"+filename);
		result.put("headImg", "/upload/"+filename);
		return result;
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable(required=true) Long id){
		firendService.deleteId(id);
		
		return "redirect:/yxlm/webmaster/firend/index/1";
		
	}
	@RequestMapping("/batDelete")
	public String batDelete(Long[] ids){
		System.out.println(ids);
		firendService.deleteAll(ids);
		return "redirect:/yxlm/webmaster/firend/index/1";
		
	}
	
	
}
