package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.entity.Article;
import com.etc.util.PageData;

@Repository(value="articleDao")
public interface ArticleDao {

	// ��ѯ����article
	public List<Article> queryArticles();

	/*public boolean addArticle(Article article);

	public boolean delArticleById(int articleId);

	// ģ����ѯ����article
	public List<Article> queryArticlesLike(String articleLike);
	
	public PageData<Article> queryArticlesLikes(int pageNo,int pageSize,String articleLike);*/


}
