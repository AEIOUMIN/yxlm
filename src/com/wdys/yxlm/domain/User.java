package com.wdys.yxlm.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.core.annotation.Order;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="yxlm_player", catalog = "yxlm")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class User implements Serializable{
	/**
	 * 字段
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",unique=true,nullable=false)
	private Long id;
	@Column(name = "name", unique = true, nullable = false, length = 20)
	private String name;
	@Column(name = "account", unique = true, length = 50)
	private String account;
	@Column(name = "password", unique = true, nullable = false, length = 50)
	private String password;
	@Column(name = "gender", length = 5)
	private String gender;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "birthday", length = 10)
	@Temporal(TemporalType.DATE)
	private Date birthday;
	@Column(name = "email", length = 50)
	private String email;
	@Column(name = "head_img", length = 100)
	private String headImg;
	@Column(name = "state", length = 1)
	private String state;
	@Column(name = "mobile", length = 15)
	private String mobile;
	@Column(name = "parentId")
	private Long parentId;
	//用户状态
	public static String USER_STATE_VALID = "1";//有效
	public static String USER_STATE_INVALID = "0";//无效
	/**
	 * 无参
	 */
	public User() {
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
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	
}
