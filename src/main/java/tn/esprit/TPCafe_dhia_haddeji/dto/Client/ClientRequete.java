package tn.esprit.TPCafe_dhia_haddeji.dto.Client;

import lombok.*;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString

public class ClientRequete {
    String nom;
    String prenom;
    LocalDate dateNaissance;
}
