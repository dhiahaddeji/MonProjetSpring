package tn.esprit.tpcafe_eyahamami.services.Article;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpcafe_eyahamami.dto.Article.ArticleRequete;
import tn.esprit.tpcafe_eyahamami.dto.Article.ArticleResponse;
import tn.esprit.tpcafe_eyahamami.entities.Article;
import tn.esprit.tpcafe_eyahamami.mapper.ArticleMapper;
import tn.esprit.tpcafe_eyahamami.repositories.ArticleRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class ArticleService implements IArticleService {
    private ArticleRepository articleRepository;
    private ArticleMapper articleMapper;
    @Override
    public ArticleResponse addArticle(ArticleRequete article) {
        Article articleEntity = articleMapper.toentity(article);
        Article savedArticle = articleRepository.save(articleEntity);

        return articleMapper.todto(savedArticle);
    }

    @Override
    public List<ArticleResponse> saveArticles(List<ArticleRequete> articles)
    {
        List<Article> art=articleMapper.toentity2(articles);
        List<Article> savedArticle=articleRepository.saveAll(art);
        return  articleMapper.todto2(savedArticle);
    }

    @Override
    public ArticleResponse selectArticleById(long id) {

        Article A=  articleRepository.findById(id).get();
        return articleMapper.todto(A);
    }

    @Override
    public List<ArticleResponse> selectAllArticles() {

        List<Article>arts=  articleRepository.findAll();
        return  articleMapper.todto2(arts);
    }

    @Override
    public void deleteArticle(ArticleRequete article) {
        Article A= articleMapper.toentity(article);
        articleRepository.delete(A);

    }

    @Override
    public void deleteAllArticles() {
        articleRepository.deleteAll();

    }

    @Override
    public void deleteArticleById(long id) {
        articleRepository.deleteById(id);

    }

    @Override
    public long countingArticles() {

        return  articleRepository.count();
    }

    @Override
    public boolean verifyArticleById(long id) {
        return  articleRepository.existsById(id);
    }
    @Override
    public boolean deleteArticle(Long id) {
        if (articleRepository.existsById(id)) {
            articleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
