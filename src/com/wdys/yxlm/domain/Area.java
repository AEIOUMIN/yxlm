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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "yxlm_area",catalog="yxlm")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler","firend"})
public class Area implements Serializable {
	/**
	 * 所属大区
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	@Column(name = "area")
	private String area;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "firend_id", nullable = false)
	private Firend firend;
	public Area() {
	}
	public Area(Firend firend) {
		this.firend=firend;
	}
	public Area(Long id, String area, Firend firend) {
		super();
		this.id = id;
		this.area = area;
		this.firend = firend;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	public Firend getFirend() {
		return firend;
	}
	public void setFirend(Firend firend) {
		this.firend = firend;
	}
	@Override
	public String toString() {
		return "Area [id=" + id + ", area=" + area + ", firend=" + firend + "]";
	}
	
}
