package tn.esprit.TPCafe_dhia_haddeji.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode


public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idClient;
    String nom;
    String prenom;
    LocalDate dateNaissance;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adresse_id_adresse")
    Adresse adresse;
    @OneToOne(mappedBy = "client" , cascade = CascadeType.ALL)
    CarteFidelite carteFidelite;
    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL)
    List<Commande> commandes=new ArrayList<>();
}