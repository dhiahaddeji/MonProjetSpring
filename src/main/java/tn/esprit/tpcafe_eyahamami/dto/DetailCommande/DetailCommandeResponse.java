package tn.esprit.tpcafe_eyahamami.dto.DetailCommande;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class DetailCommandeResponse {
    long idDetailCommande;
    int quantiteArticle;
    float sousTotalDetailArticle;
    float getSousTotalDetailArticleApresPromo;
}
