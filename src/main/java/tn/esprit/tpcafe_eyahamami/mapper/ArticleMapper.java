package tn.esprit.tpcafe_eyahamami.mapper;

import org.mapstruct.Mapper;
import tn.esprit.tpcafe_eyahamami.dto.Adresse.AdresseReponse;
import tn.esprit.tpcafe_eyahamami.dto.Adresse.AdresseRequest;
import tn.esprit.tpcafe_eyahamami.dto.Article.ArticleRequete;
import tn.esprit.tpcafe_eyahamami.dto.Article.ArticleResponse;
import tn.esprit.tpcafe_eyahamami.entities.Adresse;
import tn.esprit.tpcafe_eyahamami.entities.Article;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
    ArticleResponse todto(Article article);
    Article toentity(ArticleRequete articleRequete);
    List<ArticleResponse> todto2(List<Article> articles);
    List<Article> toentity2(List<ArticleRequete> articleRequetes);


}
