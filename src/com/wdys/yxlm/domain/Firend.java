package com.wdys.yxlm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="yxlm_firend", catalog = "yxlm")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Firend implements Serializable{
	/**
	 * 游戏玩家的朋友们
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	@Column(name = "name", nullable = false, length = 20)
	private String name;
	@Column(name = "account", unique = true, nullable = false, length = 50)
	private String account;
	@Column(name = "password", nullable = false, length = 50)
	private String password;
	@Column(name = "gender", length = 5)
	private String gender;
	@Column(name = "birthday", length = 10)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date birthday;
	@Column(name = "email", length = 50)
	private String email;
	@Column(name = "headImg", length = 100)
	private String headImg;
	@Column
	private String state;
	@Column
	private String mobile;
	public static final String FIREND_ONLINER="1";
	public static final String FIREND_NOONLINER="0";
	
	
	public Firend() {
	}
	public Firend(String name, String account, String password) {
		this.name = name;
		this.account = account;
		this.password = password;
	}
	public Firend(Long id, String name, String account, String password, String gender, Date birthday, String email,
			String headImg, String state) {
		this.id = id;
		this.name = name;
		this.account = account;
		this.password = password;
		this.gender = gender;
		this.birthday = birthday;
		this.email = email;
		this.headImg = headImg;
		this.state = state;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHeadImg() {
		return headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
