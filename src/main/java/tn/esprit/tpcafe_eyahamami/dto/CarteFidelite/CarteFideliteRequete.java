package tn.esprit.tpcafe_eyahamami.dto.CarteFidelite;

import lombok.*;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class CarteFideliteRequete {
    int pointsAccumules;
    LocalDate dateCreation;
}
