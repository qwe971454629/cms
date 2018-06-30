package com.etc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.dao.ArticleDao;
import com.etc.entity.Article;
import com.etc.service.ArticleService;

@Service(value = "articleService")
public class ArticleServiceImpl implements ArticleService {

	@Resource(name = "articleDao")
	private ArticleDao articleDao;

	public List<Article> getArticles() {
		// TODO Auto-generated method stub
		return articleDao.queryArticles();
	}

}
