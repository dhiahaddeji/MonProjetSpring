package tn.esprit.tpcafe_eyahamami.dto.Adresse;

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
