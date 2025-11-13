package tn.esprit.TPCafe_dhia_haddeji.dto.Article;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import tn.esprit.TPCafe_dhia_haddeji.enumaration.TypeArticle;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ArticleResponse {
    String nomArticle;
    float prixArticle;
    @Enumerated(EnumType.STRING)
    TypeArticle typeArticle;
}
