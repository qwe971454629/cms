package com.etc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etc.entity.Article;
import com.etc.service.ArticleService;

@Controller
@RequestMapping(value = "/api")
public class ArticleController {

	@Resource(name = "articleService")
	private ArticleService articleService;

	@RequestMapping(value = "/article", method = RequestMethod.GET)
	public String geteArticles(Model model) {
		List<Article> list = articleService.getArticles();

		model.addAttribute("list", list);

		return "list";
	}

}
