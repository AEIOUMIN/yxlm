package com.wdys.yxlm.service;

import java.util.List;

import com.wdys.yxlm.core.service.GenericService;
import com.wdys.yxlm.core.util.PagedList;
import com.wdys.yxlm.domain.Picture;

public interface PictureService extends GenericService<Picture, Long>{

	PagedList<Picture> findPageByISSP(int pageIndex, int pageSize, String search);
	public List<String>  findByPictureImg();
}
