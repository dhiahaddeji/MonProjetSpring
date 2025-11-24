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

    List<AdresseReponse> findByVille(String ville);
    List<AdresseReponse> findByCodePostal(Integer codePostal);
    long countByVille(String ville);
    void deleteByVille(String ville);
    List<AdresseReponse> findByVilleAndCodePostal(String ville, Integer codePostal);
    List<AdresseReponse> findByRueContainingIgnoreCaseAndVille(String motRue, String ville);
    List<AdresseReponse> findByVilleIn(List<String> villes);
    List<AdresseReponse> findByCodePostalBetween(Integer min, Integer max);
    List<AdresseReponse> findByCodePostalGreaterThan(Integer cp);
    List<AdresseReponse> findByCodePostalGreaterThanEqual(Integer cp);
    List<AdresseReponse> findByCodePostalLessThan(Integer cp);
    List<AdresseReponse> findByCodePostalLessThanEqual(Integer cp);
    List<AdresseReponse> findByRueStartsWithAndVille(String prefix, String ville);
    List<AdresseReponse> findByRueStartsWith(String prefix);
    List<AdresseReponse> findByVilleEndsWith(String suffix);
    List<AdresseReponse> findByRueIsNull();
    List<AdresseReponse> findByVilleIsNotNull();
}
