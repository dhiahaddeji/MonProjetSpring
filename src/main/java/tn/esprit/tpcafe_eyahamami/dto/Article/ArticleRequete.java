package tn.esprit.tpcafe_eyahamami.dto.Article;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import tn.esprit.tpcafe_eyahamami.enumaration.TypeArticle;
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
