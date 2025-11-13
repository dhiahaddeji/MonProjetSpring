package tn.esprit.TPCafe_dhia_haddeji.mapper;


import org.mapstruct.Mapper;
import tn.esprit.TPCafe_dhia_haddeji.dto.CarteFidelite.CarteFideliteRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.CarteFidelite.CarteFideliteResponse;
import tn.esprit.TPCafe_dhia_haddeji.entities.CarteFidelite;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarteFideliteMapper {
    CarteFidelite toentity(CarteFideliteRequete carteFideliteRequete);
    CarteFideliteResponse todto(CarteFidelite carteFidelite);
    List<CarteFidelite>toentity2(List<CarteFideliteRequete> carteFidelites);
    List<CarteFideliteResponse>todto2(List<CarteFidelite> carteFidelites);
}
