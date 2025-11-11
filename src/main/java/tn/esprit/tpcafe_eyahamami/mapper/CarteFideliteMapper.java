package tn.esprit.tpcafe_eyahamami.mapper;


import org.mapstruct.Mapper;
import tn.esprit.tpcafe_eyahamami.dto.CarteFidelite.CarteFideliteRequete;
import tn.esprit.tpcafe_eyahamami.dto.CarteFidelite.CarteFideliteResponse;
import tn.esprit.tpcafe_eyahamami.entities.CarteFidelite;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarteFideliteMapper {
    CarteFidelite toentity(CarteFideliteRequete carteFideliteRequete);
    CarteFideliteResponse todto(CarteFidelite carteFidelite);
    List<CarteFidelite>toentity2(List<CarteFideliteRequete> carteFidelites);
    List<CarteFideliteResponse>todto2(List<CarteFidelite> carteFidelites);
}
