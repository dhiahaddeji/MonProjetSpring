package tn.esprit.tpcafe_eyahamami.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpcafe_eyahamami.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
