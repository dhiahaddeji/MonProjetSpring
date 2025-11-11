package tn.esprit.tpcafe_eyahamami.dto.DetailCommande;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class DetailCommandeRequtes {
    long idDetailCommande;
    int quantiteArticle;
    float sousTotalDetailArticle;
    float getSousTotalDetailArticleApresPromo;
}
