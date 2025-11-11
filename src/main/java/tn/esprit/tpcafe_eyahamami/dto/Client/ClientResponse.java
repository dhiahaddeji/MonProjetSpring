package tn.esprit.tpcafe_eyahamami.dto.Client;

import lombok.*;

import java.time.LocalDate;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ClientResponse {
    String nom;
    String prenom;
    LocalDate dateNaissance;
}
