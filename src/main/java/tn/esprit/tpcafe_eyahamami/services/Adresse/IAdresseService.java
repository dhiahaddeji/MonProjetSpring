package tn.esprit.tpcafe_eyahamami.services.Adresse;

import tn.esprit.tpcafe_eyahamami.dto.Adresse.AdresseReponse;
import tn.esprit.tpcafe_eyahamami.dto.Adresse.AdresseRequest;
import tn.esprit.tpcafe_eyahamami.entities.Adresse;

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
