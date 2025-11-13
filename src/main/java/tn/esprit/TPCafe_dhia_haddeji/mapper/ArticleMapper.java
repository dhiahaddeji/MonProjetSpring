package tn.esprit.TPCafe_dhia_haddeji.mapper;

import org.mapstruct.Mapper;
import tn.esprit.TPCafe_dhia_haddeji.dto.Article.ArticleRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.Article.ArticleResponse;
import tn.esprit.TPCafe_dhia_haddeji.entities.Article;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
    ArticleResponse todto(Article article);
    Article toentity(ArticleRequete articleRequete);
    List<ArticleResponse> todto2(List<Article> articles);
    List<Article> toentity2(List<ArticleRequete> articleRequetes);


}
