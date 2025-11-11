package tn.esprit.tpcafe_eyahamami.dto.Client;

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
