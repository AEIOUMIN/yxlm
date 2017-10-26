package com.wdys.yxlm.service;

import com.wdys.yxlm.core.service.GenericService;
import com.wdys.yxlm.domain.Firend;

public interface FirendService extends GenericService<Firend, Long>{
	public void deleteAll(Long[] ids);
	public void deleteId(Long id);
}
