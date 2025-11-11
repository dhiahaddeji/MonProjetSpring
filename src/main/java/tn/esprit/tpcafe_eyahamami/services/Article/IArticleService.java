package tn.esprit.tpcafe_eyahamami.services.Article;


import tn.esprit.tpcafe_eyahamami.dto.Article.ArticleRequete;
import tn.esprit.tpcafe_eyahamami.dto.Article.ArticleResponse;
import tn.esprit.tpcafe_eyahamami.entities.Article;

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
