package com.wdys.yxlm.service;

import java.util.List;

import com.wdys.yxlm.core.service.GenericService;
import com.wdys.yxlm.domain.Node;
import com.wdys.yxlm.domain.Pattern;

public interface PatternService extends GenericService<Pattern, Long>{
	public List<Node> findTree();
}
