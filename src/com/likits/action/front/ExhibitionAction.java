package com.likits.action.front;

import java.util.List;
import java.util.Map;
import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.Action;
import com.likits.entity.front.Article;
import com.likits.service.front.ArticleService;
import com.likits.service.front.RecommendService;
import com.likits.util.BaseAction;

public class ExhibitionAction extends BaseAction implements Action {
	
	public static final Log log = LogFactory.getLog(ExhibitionAction.class);
	
	private RecommendService recommendService;
	
	private ArticleService articleService;
	
	
	@Override
	public String execute() throws Exception {
		HttpServletRequest req = ServletActionContext.getRequest();
		req.setAttribute("recommendUsers", recommendService.getRecommendUser());
		req.setAttribute("recommendArticles", recommendService.getRecommendArticle());
		req.setAttribute("articles", articleService.getArticlePaged());
		//articleService.addArticle(null);
		return "success";
	}
	
	public void addNewArticle(Map<Object, Object> data) {
		JSONObject jo = new JSONObject();
		jo.put("status", "success");
		this.toResponse(jo.toString());
	}
	
	public void setRecommendService(RecommendService recommendService) {
		this.recommendService = recommendService;
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}
}
