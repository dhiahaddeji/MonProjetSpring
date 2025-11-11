package tn.esprit.tpcafe_eyahamami.dto.Commande;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import tn.esprit.tpcafe_eyahamami.enumaration.StatusCommande;

import java.time.LocalDate;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CommandResponse {
    LocalDate dateCommande;
    float totalCommande;
    @Enumerated(EnumType.STRING)
    StatusCommande statusCommande;
}
