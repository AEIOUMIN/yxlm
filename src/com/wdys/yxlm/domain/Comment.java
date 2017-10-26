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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="yxlm_comment",catalog="yxlm")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "news","handler","gamerecord","firend"})
public class Comment implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	@Column(name = "content", length = 3000)
	private String content;
	@Column(name = "author", length = 30)
	private String author;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", length = 19)
	private Date createDate;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "news_id")
	private New news;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "firend_id")
	private Firend firend;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gamerecord_id")
	private Gamerecord  gamerecord;
	public Comment() {

	}
	public Comment(New news,Firend firend,Gamerecord  gamerecord) {
		this.news=news;
		this.firend=firend;
		this.gamerecord=gamerecord;
	}
	public Comment( String content, String author, Date createDate, New news, Firend firend,
			Gamerecord gamerecord) {
		this.content = content;
		this.author = author;
		this.createDate = createDate;
		this.news = news;
		this.firend = firend;
		this.gamerecord = gamerecord;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public New getNews() {
		return news;
	}
	public void setNews(New news) {
		this.news = news;
	}
	public Firend getFirend() {
		return firend;
	}
	public void setFirend(Firend firend) {
		this.firend = firend;
	}
	public Gamerecord getGamerecord() {
		return gamerecord;
	}
	public void setGamerecord(Gamerecord gamerecord) {
		this.gamerecord = gamerecord;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", content=" + content + ", author=" + author + ", createDate=" + createDate
				+ ", news=" + news + ", firend=" + firend + ", gamerecord=" + gamerecord + "]";
	}
	
	
}
