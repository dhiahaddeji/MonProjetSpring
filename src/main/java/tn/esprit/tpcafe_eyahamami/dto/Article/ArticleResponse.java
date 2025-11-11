package tn.esprit.tpcafe_eyahamami.dto.Article;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import tn.esprit.tpcafe_eyahamami.enumaration.TypeArticle;
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
