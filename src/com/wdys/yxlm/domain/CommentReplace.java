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
@Table(name="yxlm_commentreplace", catalog = "yxlm")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler","firend"})
public class CommentReplace implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", length = 19)
	private Date createDate;
	@Column(name = "content", length = 65535)
	private String content;
	@Column(name = "player_name", length = 20)
	private String playerName;
	@Column(name = "player_area", length = 20)
	private String playerArea;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "firend_id", nullable = false)
	private Firend firend;
	public CommentReplace() {
	}
	public CommentReplace(Firend firend) {
		this.firend=firend;
	}
	public CommentReplace( Date createDate, String content, String playerName, String playerArea,
			Firend firend) {
		this.createDate = createDate;
		this.content = content;
		this.playerName = playerName;
		this.playerArea = playerArea;
		this.firend = firend;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerArea() {
		return playerArea;
	}
	public void setPlayerArea(String playerArea) {
		this.playerArea = playerArea;
	}
	public Firend getFirend() {
		return firend;
	}
	public void setFirend(Firend firend) {
		this.firend = firend;
	}
	@Override
	public String toString() {
		return "CommentReplace [id=" + id + ", createDate=" + createDate + ", content=" + content + ", playerName="
				+ playerName + ", playerArea=" + playerArea + ", firend=" + firend + "]";
	}
	
	
}
