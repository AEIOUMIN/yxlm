package com.wdys.yxlm.service;

import java.util.List;

import com.wdys.yxlm.core.service.GenericService;
import com.wdys.yxlm.domain.Node;
import com.wdys.yxlm.domain.Topic;


public interface TopicService extends GenericService<Topic, Long>{
		public List<Node> findTree();
}
