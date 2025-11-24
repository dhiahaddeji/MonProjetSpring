package tn.esprit.TPCafe_dhia_haddeji.dto.Adresse;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdresseReponse {
    private long idAdresse;
    private String rue;
    private String ville;
    private int codePostal;
}
