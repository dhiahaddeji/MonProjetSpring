package tn.esprit.tpcafe_eyahamami.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpcafe_eyahamami.entities.DetailCommande;

public interface DetailCommandeRepository extends JpaRepository<DetailCommande, Long> {
}
