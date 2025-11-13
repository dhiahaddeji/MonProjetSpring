package tn.esprit.TPCafe_dhia_haddeji.mapper;

import org.mapstruct.Mapper;
import tn.esprit.TPCafe_dhia_haddeji.dto.Adresse.AdresseReponse;
import tn.esprit.TPCafe_dhia_haddeji.dto.Adresse.AdresseRequest;
import tn.esprit.TPCafe_dhia_haddeji.entities.Adresse;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdresseMapper {
    AdresseReponse todto(Adresse adresse);
    Adresse toentity(AdresseRequest adresseReponse);
    List<AdresseReponse> todto2(List<Adresse> adresses);
    List<Adresse> toentity2(List<AdresseRequest> adresses);
}
