package com.example.system.service;

import com.example.system.model.Article;
import com.example.system.repository.ArticleRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class ArticleService {
    @Autowired
    ArticleRepository articleRepository;

    public Article saveArticle(Article article) {
        int sequence = articleRepository.getNextVal();
        String id = articleRepository.getSequence(5,"ART",sequence);
        article.setIdArticle(id);
        return articleRepository.save(article);
    }

    public List<Article> getAllArticle() {
        return articleRepository.findAll();
    }

    public Article getByIdArticle(String id) {
        return articleRepository.findById(id).get();
    }
}
