package tn.esprit.TPCafe_dhia_haddeji.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode



public class CarteFidelite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idCarteFidelite;
    int pointsAccumules;
    LocalDate dateCreation;
    @OneToOne
    @JoinColumn(name = "client_id_client") // FK vers client
    Client client;

}