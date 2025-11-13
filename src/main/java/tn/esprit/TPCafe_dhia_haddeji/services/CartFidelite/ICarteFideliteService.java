package tn.esprit.TPCafe_dhia_haddeji.services.CartFidelite;


import tn.esprit.TPCafe_dhia_haddeji.dto.CarteFidelite.CarteFideliteRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.CarteFidelite.CarteFideliteResponse;

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
