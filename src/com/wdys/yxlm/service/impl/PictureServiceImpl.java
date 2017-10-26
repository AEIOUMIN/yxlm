package com.wdys.yxlm.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdys.yxlm.core.service.impl.GenericServiceImpl;
import com.wdys.yxlm.core.util.PagedList;
import com.wdys.yxlm.core.util.StringUtil;
import com.wdys.yxlm.domain.Picture;
import com.wdys.yxlm.repository.PictureRepository;
import com.wdys.yxlm.service.PictureService;

@Service

public class PictureServiceImpl 
			extends GenericServiceImpl<Picture, Long>
			implements PictureService{
	@Autowired
	private PictureRepository pictureRepository;
	
	@Override
	public PagedList<Picture> findPageByISSP(int pageIndex, int pageSize, String search) {
		if(StringUtil.isEmpty(search)){
		 return	findPage(pageIndex, pageSize);
		}else{
			return findPage(pageIndex, pageSize, " where u.picture.heroName  like ?", "%"+search+"%");
		}

}
		@Transactional
		public List<String>  findByPictureImg(){
			return pictureRepository.findByPictureImg();
			
		}
}
