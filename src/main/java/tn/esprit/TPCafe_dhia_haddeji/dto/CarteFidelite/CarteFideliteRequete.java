package tn.esprit.TPCafe_dhia_haddeji.dto.CarteFidelite;

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
