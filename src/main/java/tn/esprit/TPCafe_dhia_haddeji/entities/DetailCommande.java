package tn.esprit.TPCafe_dhia_haddeji.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode

public class DetailCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idDetailCommande;
    int quantiteArticle;
    float sousTotalDetailArticle;
    float getSousTotalDetailArticleApresPromo;
    @ManyToOne
    Commande commande;
    @ManyToOne
    Article article;
}