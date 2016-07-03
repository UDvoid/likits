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
	
	@Column(length = 1000,name="title")
	private String title;
	
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
	private Integer userId;
	
	@Column(name="tag")
	private Integer tagId;
	
	@Column(name="coverImage")
	private String coverImage;
	
	@Column(name="category")
	private String categoryId;
	
	@Column(name="infoOrArticleTags")
	private Integer infoOrArticleTagsId;
	
	@Column(name="infoOrArticleSubTags")
	private Integer infoOrArticleSubTagsId;
	
	@Column(name="state")
	private Integer stateId;
	
	
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

	
	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTagId() {
		return tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getInfoOrArticleTagsId() {
		return infoOrArticleTagsId;
	}

	public void setInfoOrArticleTagsId(Integer infoOrArticleTagsId) {
		this.infoOrArticleTagsId = infoOrArticleTagsId;
	}

	public Integer getInfoOrArticleSubTagsId() {
		return infoOrArticleSubTagsId;
	}

	public void setInfoOrArticleSubTagsId(Integer infoOrArticleSubTagsId) {
		this.infoOrArticleSubTagsId = infoOrArticleSubTagsId;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
}
