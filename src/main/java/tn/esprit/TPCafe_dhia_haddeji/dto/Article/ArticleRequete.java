package tn.esprit.TPCafe_dhia_haddeji.dto.Article;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import tn.esprit.TPCafe_dhia_haddeji.enumaration.TypeArticle;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ArticleRequete {
    String nomArticle;
    float prixArticle;
    @Enumerated(EnumType.STRING)
    TypeArticle typeArticle;
}
