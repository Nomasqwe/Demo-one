package service;

import api.Article;

import java.util.*;

public interface ArticleService {
    List<Article> getArticles(String url);
}
