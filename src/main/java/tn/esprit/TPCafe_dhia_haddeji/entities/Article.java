package tn.esprit.TPCafe_dhia_haddeji.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.TPCafe_dhia_haddeji.enumaration.TypeArticle;


import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode


public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idArticle;
    String nomArticle;
    float prixArticle;
    @Enumerated(EnumType.STRING)
    TypeArticle typeArticle;
    @OneToMany(mappedBy = "article")
    List<DetailCommande> detailCommandes;
    @ManyToMany (cascade = CascadeType.ALL)
    List<Promotion> promotions;
}