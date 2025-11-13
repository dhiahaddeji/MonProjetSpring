package tn.esprit.TPCafe_dhia_haddeji.services.Adresse;



import tn.esprit.TPCafe_dhia_haddeji.dto.Adresse.AdresseReponse;
import tn.esprit.TPCafe_dhia_haddeji.dto.Adresse.AdresseRequest;
import tn.esprit.TPCafe_dhia_haddeji.entities.Adresse;

import java.util.List;

public interface IAdresseService {
    AdresseReponse addAdresse(AdresseRequest adresse);
    List<AdresseReponse>saveAdresses(List<AdresseRequest> adresses);
    public Adresse selectAdresseByIdWithOrElse(long id);
    public AdresseReponse selectAdresseByIDwithGet(long id);
    List<AdresseReponse> selectAllAdresses();
    void deleteAdresse(AdresseRequest adresse);
    void deleteAllAdresses();
    void deleteAdresseById(long id);
    long countingAdresse();
    boolean verifyAdresseById(long id);
}
