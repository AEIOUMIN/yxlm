package com.wdys.yxlm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="yxlm_video", catalog = "yxlm")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler",
			"pattern","area","firend","user"})
public class Video implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	@Column(name="create_date")
	private Date createDate;
	@Column
	private String video;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pattern_id", nullable = false)
	private Pattern pattern;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "area_id", nullable = false)
	private Area area;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "firend_id", nullable = false)
	private Firend firend;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "player_id", nullable = false)
	private User user;
	
	public Video() {
	}
	
	public Video(Date createDate, String video, Pattern pattern, Area area, Firend firend, User user) {
		super();
		this.createDate = createDate;
		this.video = video;
		this.pattern = pattern;
		this.area = area;
		this.firend = firend;
		this.user = user;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public Pattern getPattern() {
		return pattern;
	}
	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public Firend getFirend() {
		return firend;
	}
	public void setFirend(Firend firend) {
		this.firend = firend;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Video [id=" + id + ", createDate=" + createDate + ", video=" + video + ", pattern=" + pattern
				+ ", area=" + area + ", firend=" + firend + ", user=" + user + "]";
	}
	
	
}
