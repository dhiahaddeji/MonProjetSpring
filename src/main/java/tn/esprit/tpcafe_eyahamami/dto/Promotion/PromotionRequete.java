package tn.esprit.tpcafe_eyahamami.dto.Promotion;

import lombok.*;

import java.time.LocalDate;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class PromotionRequete {
    String pourcentagePromo;
    LocalDate dateDebutPromo;
    LocalDate dateFinPromo;
}
