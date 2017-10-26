package com.wdys.yxlm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wdys.yxlm.core.service.impl.GenericServiceImpl;
import com.wdys.yxlm.domain.Node;
import com.wdys.yxlm.domain.Topic;
import com.wdys.yxlm.service.TopicService;

@Service
public class TopicServiceImpl 
			 extends GenericServiceImpl<Topic, Long>
			 implements TopicService{

	@Override
	public List<Node> findTree() {
		//把生成的树放入此集合里
		List<Node> nodes = new ArrayList<>();
		//根据条生成树
		findTree(nodes,null);
		return nodes;
	}

	private void findTree(List<Node> nodes, Long  parentId) {
		List<Topic> topics = findTopics(parentId);
		
		for(Topic topic:topics){
			Node node = new Node(topic.getId(),parentId,topic.getTopicName());
			nodes.add(node);
			findTree(node.getChildren(),topic.getId());
		}
		
	}

	private List<Topic> findTopics(Long parentId) {
		if(parentId==null){
			return genericRepository.findList(" where u.topic.id is null ", "");
		}else{
			return genericRepository.findList(" where u.topic.id =?0 ", parentId);
		}
		
	}

}
