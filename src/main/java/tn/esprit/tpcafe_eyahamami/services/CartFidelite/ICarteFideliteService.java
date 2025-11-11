package tn.esprit.tpcafe_eyahamami.services.CartFidelite;

import tn.esprit.tpcafe_eyahamami.dto.CarteFidelite.CarteFideliteRequete;
import tn.esprit.tpcafe_eyahamami.dto.CarteFidelite.CarteFideliteResponse;
import tn.esprit.tpcafe_eyahamami.entities.CarteFidelite;

import java.util.List;

public interface ICarteFideliteService {
    CarteFideliteResponse addCarteFidelite(CarteFideliteRequete carteFidelite);
    List<CarteFideliteResponse> saveCarteFidelites (List<CarteFideliteRequete> carteFidelites);
    CarteFideliteResponse selectCarteFideliteById(long id);
    List<CarteFideliteResponse> selectAllCarteFidelites();
    void deleteCarteFidelite(CarteFideliteRequete carteFidelite);
    void deleteAllCarteFidelites();
    void deleteCarteFideliteById(long id);
    long countingCarteFidelites();
    boolean verifyCarteFideliteById(long id);
}
