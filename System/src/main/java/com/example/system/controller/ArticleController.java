package com.example.system.controller;

import com.example.system.model.Article;
import com.example.system.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/articleurl")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping(path="/saveArticle")
    public Article saveArticle(@RequestBody Article article) {
        return articleService.saveArticle(article);
    }
}
