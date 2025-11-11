package tn.esprit.tpcafe_eyahamami.mapper;

import org.mapstruct.Mapper;
import tn.esprit.tpcafe_eyahamami.dto.Adresse.AdresseReponse;
import tn.esprit.tpcafe_eyahamami.dto.Adresse.AdresseRequest;
import tn.esprit.tpcafe_eyahamami.entities.Adresse;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdresseMapper {
    AdresseReponse todto(Adresse adresse);
    Adresse toentity(AdresseRequest adresseReponse);
    List<AdresseReponse> todto2(List<Adresse> adresses);
    List<Adresse> toentity2(List<AdresseRequest> adresses);
}
