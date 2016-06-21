package com.likits.service.front;

import java.util.List;
import java.util.Map;

public interface ArticleService {
	
	List<Map<String, Object>> getArticlePaged();
	
	void addArticle(Map<String, Object> articleInfo);

}
