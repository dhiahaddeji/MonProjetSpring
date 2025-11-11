package tn.esprit.tpcafe_eyahamami.dto.CarteFidelite;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CarteFideliteResponse {
    int pointsAccumules;
    LocalDate dateCreation;
}
