package com.likits.entity.front;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="likits_articles")
public class Article implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(length = 100,name="title")
	private String title;
	
	@Column(name="category")
	private String category;
	
	@Column(name="publishTime")
	private Date publishTime;
	
	@Column(name="content")
	private String content;
	
	@Column(name="readCounter")
	private Integer readCounter;
	
	@Column(name="starCounter")
	private Integer starCounter;
	
	@Column(name="forwardCounter")
	private Integer forwardCounter;
	
	@Column(name="user")
	private Integer user;
	
	@Column(name="tag")
	private Integer tag;
	
	@Column(name="coverImage")
	private String coverImage;
	
	@Column(name="infoOrArticleTags")
	private Integer infoOrArticleTags;
	
	@Column(name="infoOrArticleSubTags")
	private Integer infoOrArticleSubTags;
	
	public Integer getReadCounter() {
		return readCounter;
	}

	public void setReadCounter(Integer readCounter) {
		this.readCounter = readCounter;
	}

	public Integer getStarCounter() {
		return starCounter;
	}

	public void setStarCounter(Integer starCounter) {
		this.starCounter = starCounter;
	}

	public Integer getForwardCounter() {
		return forwardCounter;
	}

	public void setForwardCounter(Integer forwardCounter) {
		this.forwardCounter = forwardCounter;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Integer getTag() {
		return tag;
	}

	public void setTag(Integer tag) {
		this.tag = tag;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public Integer getInfoOrArticleTags() {
		return infoOrArticleTags;
	}

	public void setInfoOrArticleTags(Integer infoOrArticleTags) {
		this.infoOrArticleTags = infoOrArticleTags;
	}

	public Integer getInfoOrArticleSubTags() {
		return infoOrArticleSubTags;
	}

	public void setInfoOrArticleSubTags(Integer infoOrArticleSubTags) {
		this.infoOrArticleSubTags = infoOrArticleSubTags;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
