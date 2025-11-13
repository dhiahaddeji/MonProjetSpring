package tn.esprit.TPCafe_dhia_haddeji.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.TPCafe_dhia_haddeji.enumaration.StatusCommande;


import java.time.LocalDate;
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


public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idCommande;
    LocalDate dateCommande;
    float totalCommande;
    @Enumerated(EnumType.STRING)
    StatusCommande statusCommande;
    @OneToMany(mappedBy = "commande")
    List<DetailCommande> detailCommandes;
    @ManyToOne
    Client client;

}