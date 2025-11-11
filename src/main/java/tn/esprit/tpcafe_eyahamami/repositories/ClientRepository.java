package tn.esprit.tpcafe_eyahamami.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpcafe_eyahamami.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
