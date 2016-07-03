package com.likits.service.front.impl;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.likits.dao.front.ArticleDao;
import com.likits.dao.front.UserDao;
import com.likits.entity.front.Article;
import com.likits.entity.front.User;
import com.likits.service.front.ArticleService;
public class ArticleServiceImpl implements ArticleService{
	
	private ArticleDao articleDao;
	
	private UserDao userDao;
	
	@Override
	public List<Map<String, Object>> getArticlePaged() {
		List<Map<String, Object>> result = new ArrayList<>();
		Map<String, Object> articleInfo = null;
		Article article = null;
		User user = null;
		/**
		 * TODO:加入分页
		 * 此处mock数据
		 */
		List<Article> articles = articleDao.getArticleInfo(0, 10);
		for(int i = 0; i < articles.size(); i++) {
			articleInfo = new HashMap<>();
			article = articles.get(i);
			user = userDao.findById(article.getUserId());
			articleInfo.put("newsId", article.getId());
			articleInfo.put("newsTitle", article.getTitle());
			articleInfo.put("newsDesc", "现在一个球队有三套球衣，主场，客场，第三球衣（备用球衣）主场作战的球队穿主场球衣。这是最大前提...");
			articleInfo.put("newsUser", user.getUsername());
			articleInfo.put("newsUserAvatar", "assets/images/img2/img2.jpg");
			articleInfo.put("newsWatch", article.getReadCounter());
			articleInfo.put("newsLike", article.getStarCounter());
			articleInfo.put("newsDate", "12-25 09:01");
			articleInfo.put("newsImage", "assets/images/ex-img/ex1.jpg");
			result.add(articleInfo);
		}
		return result;
	}

	@Override
	public void addArticle(Map<String, Object> articleInfo) {
		// TODO Auto-generated method stub
		int newArticleId = 0;
		Article article = new Article();
		article.setTitle("123455");
		article.setUserId(1);
		article.setPublishTime(new Date());
		article.setStateId(1);
		newArticleId = articleDao.addArticle(article);
		return;
	}

	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
