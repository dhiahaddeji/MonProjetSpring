package tn.esprit.TPCafe_dhia_haddeji.dto.Commande;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import tn.esprit.TPCafe_dhia_haddeji.enumaration.StatusCommande;

import java.time.LocalDate;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CommandRequete {
    LocalDate dateCommande;
    float totalCommande;
    @Enumerated(EnumType.STRING)
    StatusCommande statusCommande;
}
