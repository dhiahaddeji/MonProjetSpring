package  tn.esprit.TPCafe_dhia_haddeji.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.TPCafe_dhia_haddeji.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}