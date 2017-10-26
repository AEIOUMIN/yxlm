package com.wdys.yxlm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wdys.yxlm.core.service.impl.GenericServiceImpl;
import com.wdys.yxlm.domain.Node;
import com.wdys.yxlm.domain.Pattern;
import com.wdys.yxlm.service.PatternService;

@Service
public class PatternServiceImpl 
			extends GenericServiceImpl<Pattern, Long>
			implements PatternService{

	@Override
	public List<Node> findTree() {
		List<Node> nodes = new ArrayList<>();
		
		findTree(nodes,null);
		return nodes;
	}

	private void findTree(List<Node> nodes, Long parentId) {
		//存放根据父类id查到的patterns
		List<Pattern> patterns =findPatterns(parentId);
		//遍历获取每一个pattern
		for(Pattern pattern:patterns){
			//放入node节点
			Node node = new Node(pattern.getId(),parentId,pattern.getPattern());
			//放入children
			nodes.add(node);
			
			findTree(node.getChildren(),pattern.getId());
		}
		
	}

	private List<Pattern> findPatterns(Long parentId) {
		if(parentId==null){
			return findList(" where u.pattern.id is null ", "");
		}else{
			return findList(" where u.pattern.id =?0 ", parentId);
		}
		
	}

}
