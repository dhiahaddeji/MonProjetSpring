package tn.esprit.TPCafe_dhia_haddeji.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.Builder;

@lombok.Data
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Builder

public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdresse;
    private String rue;
    private String ville;
    private String codePostal;
}
