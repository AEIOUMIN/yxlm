package com.wdys.yxlm.service;

import com.wdys.yxlm.core.service.GenericService;
import com.wdys.yxlm.core.util.PagedList;
import com.wdys.yxlm.domain.New;

public interface NewService extends GenericService<New, Long>{

	void deleteByNewId(Long id);

	void deleteByNewIds(Long[] ids);

	PagedList<New> findPage(int pageIndex, int pageSize, Long topicId);

	
}
