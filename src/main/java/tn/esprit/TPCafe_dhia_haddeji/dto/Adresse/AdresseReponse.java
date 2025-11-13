package tn.esprit.TPCafe_dhia_haddeji.dto.Adresse;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdresseReponse {
    String rue;
    String ville;
    String postalCode;
}
