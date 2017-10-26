package com.wdys.yxlm.repository;

import java.util.List;

import com.wdys.yxlm.core.repository.GenericRepository;
import com.wdys.yxlm.domain.Picture;

public interface PictureRepository extends GenericRepository<Picture, Long>{
	public List<String>  findByPictureImg();
}
