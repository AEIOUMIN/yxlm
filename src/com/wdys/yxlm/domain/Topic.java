package com.wdys.yxlm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="yxlm_topic", catalog = "yxlm")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler","topic","topics"})
public class Topic implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	@Column(name="topic_name")
	private String topicName;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="parentId")
	private Topic topic;
	@Column(name="url")
	private String url;
	@Column(name="color")
	private String color;
	@Column(name="image")
	private String image;
	@Column(name="admin_url")
	private String adminUrl;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="topic")
	@OrderBy("id")
	private List<Topic> topics = new ArrayList<Topic>(0);
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public List<Topic> getTopics() {
		return topics;
	}
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAdminUrl() {
		return adminUrl;
	}
	public void setAdminUrl(String adminUrl) {
		this.adminUrl = adminUrl;
	}
	
}
