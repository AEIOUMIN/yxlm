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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="yxlm_pattern", catalog = "yxlm")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler","patterns","patternTwo"})
public class Pattern implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	@Column(name = "pattern", unique = true, length = 50)
	private String pattern;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="parentId")
	private Pattern patternTwo;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="patternTwo")
	private List<Pattern> patterns = new ArrayList<Pattern>(0);
	
	
	public Pattern() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	public Pattern getPatternTwo() {
		return patternTwo;
	}
	public void setPatternTwo(Pattern patternTwo) {
		this.patternTwo = patternTwo;
	}
	public List<Pattern> getPatterns() {
		return patterns;
	}
	public void setPatterns(List<Pattern> patterns) {
		this.patterns = patterns;
	}
	@Override
	public String toString() {
		return "Pattern [id=" + id + ", pattern=" + pattern + ", patternTwo=" + patternTwo + ", patterns=" + patterns
				+ "]";
	}
	
	
}
