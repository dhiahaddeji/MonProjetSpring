package tn.esprit.TPCafe_dhia_haddeji.dto.DetailCommande;

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
