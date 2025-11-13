package tn.esprit.TPCafe_dhia_haddeji.services.Article;


import tn.esprit.TPCafe_dhia_haddeji.dto.Article.ArticleRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.Article.ArticleResponse;

import java.util.List;

public interface IArticleService {
    ArticleResponse addArticle(ArticleRequete article);
    List<ArticleResponse> saveArticles (List<ArticleRequete> articles);
    ArticleResponse selectArticleById(long id);
    List<ArticleResponse> selectAllArticles();
    void deleteArticle(ArticleRequete article);
    void deleteAllArticles();
    void deleteArticleById(long id);
    long countingArticles();
    boolean verifyArticleById(long id);
    boolean deleteArticle(Long id);

}
