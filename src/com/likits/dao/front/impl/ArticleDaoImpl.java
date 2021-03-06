package com.likits.dao.front.impl;

import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.Session;

import com.likits.dao.BaseDao;
import com.likits.dao.front.ArticleDao;
import com.likits.entity.front.Article;

public class ArticleDaoImpl extends BaseDao<Article, Integer>implements ArticleDao{
	
	@Override
	public List<Article> getArticleInfo(int start, int end) {
		String queryStr = "from Article";
		queryStr += " where id > " + start +" and id < " + end;
	   	return this.find(queryStr);
	}
	
	@Override
	public Article getArticlebyId(int articleId) {
		String queryStr = "from Article";
		queryStr += " where id = " + articleId;
		return this.find(queryStr).get(0);
	}
	
	@Override
	public int getArticleCount() {
		String queryStr = "select count(*) from Article";
		return this.count(queryStr);
	}

	@Override
	public List<Article> getRecommendArticle() {
		String queryStr = "from Article order by rand()";
		return this.findBylimit(queryStr, 5);
	}

	@Override
	public int addArticle(Article article) {
		// TODO Auto-generated method stub
		this.save(article);
		return article.getId();
	}
	
	
}
