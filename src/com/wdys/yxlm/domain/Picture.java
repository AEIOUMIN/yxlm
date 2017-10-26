package com.wdys.yxlm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="yxlm_picture", catalog = "yxlm")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler","user"})
public class Picture implements Serializable{
	/**
	 * 照片
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	@Column(name="pictureImg")
	private String pictureImg;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="player_id")
	private User user;
	@Column(name="story")
	private String story;
	@Column(name="hero_name")
	private String heroName;
	@Column(name="love")
	private Long love;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_date" ,length=19)
	private Date createDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPictureImg() {
		return pictureImg;
	}
	public void setPictureImg(String pictureImg) {
		this.pictureImg = pictureImg;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public Long getLove() {
		return love;
	}
	public void setLove(Long love) {
		this.love = love;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
