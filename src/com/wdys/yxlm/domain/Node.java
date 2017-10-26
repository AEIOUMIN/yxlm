package com.wdys.yxlm.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Node----节点类，用来表示属性结构
 * 
 * @author Administrator
 *
 */
public class Node {
	private Long id;
	private Long parentId; //父类id
	private String text; //内容
	private List<Node> children = new ArrayList<>();//子节点

	public Node() {

	}
	

	public Node(Long id, Long parentId, String text) {

		this.id = id;
		this.parentId = parentId;
		this.text = text;

	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getParentId() {
		return parentId;
	}


	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public List<Node> getChildren() {
		return children;
	}


	public void setChildren(List<Node> children) {
		this.children = children;
	}


	@Override
	public String toString() {
		return "Node [id=" + id + ", parentId=" + parentId + ", text=" + text + ", children=" + children + "]";
	}
	

}
