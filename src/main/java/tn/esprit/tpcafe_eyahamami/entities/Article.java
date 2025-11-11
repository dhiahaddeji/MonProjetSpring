package tn.esprit.tpcafe_eyahamami.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.tpcafe_eyahamami.enumaration.TypeArticle;

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
    @ManyToMany
    List<Promotion> promotions;
}
