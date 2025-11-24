package tn.esprit.TPCafe_dhia_haddeji.services.Adresse;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.TPCafe_dhia_haddeji.dto.Adresse.AdresseReponse;
import tn.esprit.TPCafe_dhia_haddeji.dto.Adresse.AdresseRequest;
import tn.esprit.TPCafe_dhia_haddeji.entities.Adresse;
import tn.esprit.TPCafe_dhia_haddeji.mapper.AdresseMapper;
import tn.esprit.TPCafe_dhia_haddeji.repositories.AdresseRepository;


import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class Adresseservice implements IAdresseService{
    private AdresseRepository adresseRepository;
    private AdresseMapper adresseMapper;
    @Override
    public AdresseReponse addAdresse(AdresseRequest adresse) {
        Adresse A= adresseMapper.toentity(adresse);
        Adresse B= adresseRepository.save(A);
        return adresseMapper.todto(B);
    }

    @Override
    public List<AdresseReponse> saveAdresses(List<AdresseRequest> adresses) {
        List<Adresse>a=adresseMapper.toentity2(adresses);
        List<Adresse>A= adresseRepository.saveAll(a);
        return adresseMapper.todto2(A);

    }

    @Override

    public Adresse selectAdresseByIdWithOrElse(long id) {

        return adresseRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("adresse not find"+id)); // --------------> s'il nexiste pas une adresse avec ce id elle return un objet personaliser
        //return adresseRository.findby id.get() ---------->s'il nexiste pas une adresse avec ce id elle return un objet vide
    }
    public AdresseReponse selectAdresseByIDwithGet(long id) {
        Adresse a =adresseRepository.findById(id).get();
        return adresseMapper.todto(a);
    }

    @Override
    public List<AdresseReponse> selectAllAdresses() {
        List<Adresse>a=adresseRepository.findAll();
        return adresseMapper.todto2(a);
    }

    @Override
    public void deleteAdresse(AdresseRequest adresse) {

        Adresse a =adresseMapper.toentity(adresse);
        adresseRepository.delete(a);

    }

    @Override
    public void deleteAllAdresses() {
        adresseRepository.deleteAll();

    }

    @Override
    public void deleteAdresseById(long id) {
        adresseRepository.deleteById(id);

    }

    @Override
    public long countingAdresse() {
        return adresseRepository.count();
    }

    @Override
    public boolean verifyAdresseById(long id) {
        return adresseRepository.existsById(id);
    }


    /// ////////////////////////////////////

    @Override
    public List<AdresseReponse> findByVille(String ville) {
        return adresseRepository.findByVille(ville)
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdresseReponse> findByCodePostal(Integer codePostal) {
        return adresseRepository.findByCodePostal(codePostal)
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public long countByVille(String ville) {
        return adresseRepository.countByVille(ville);
    }

    @Override
    public void deleteByVille(String ville) {
        adresseRepository.deleteByVille(ville);
    }

    @Override
    public List<AdresseReponse> findByVilleAndCodePostal(String ville, Integer codePostal) {
        return adresseRepository.findByVilleAndCodePostal(ville, codePostal)
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdresseReponse> findByRueContainingIgnoreCaseAndVille(String motRue, String ville) {
        return adresseRepository.findByRueIgnoreCaseContainingAndVilleIgnoreCase(motRue, ville)
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdresseReponse> findByVilleIn(List<String> villes) {
        return adresseRepository.findByVilleIn(villes)
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdresseReponse> findByCodePostalBetween(Integer min, Integer max) {
        return adresseRepository.findByCodePostalBetween(min, max)
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdresseReponse> findByCodePostalGreaterThan(Integer cp) {
        return adresseRepository.findByCodePostalGreaterThan(cp)
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdresseReponse> findByCodePostalGreaterThanEqual(Integer cp) {
        return adresseRepository.findByCodePostalGreaterThanEqual(cp)
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdresseReponse> findByCodePostalLessThan(Integer cp) {
        return adresseRepository.findByCodePostalLessThan(cp)
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdresseReponse> findByCodePostalLessThanEqual(Integer cp) {
        return adresseRepository.findByCodePostalLessThanEqual(cp)
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdresseReponse> findByRueStartsWithAndVille(String prefix, String ville) {
        return adresseRepository.findByRueStartsWithAndVilleOrderByCodePostal(prefix, ville)
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdresseReponse> findByRueStartsWith(String prefix) {
        return adresseRepository.findByRueStartsWith(prefix)
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdresseReponse> findByVilleEndsWith(String suffix) {
        return adresseRepository.findByVilleEndsWith(suffix)
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdresseReponse> findByRueIsNull() {
        return adresseRepository.findByRueIsNull()
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

    @Override
    public List<AdresseReponse> findByVilleIsNotNull() {
        return adresseRepository.findByVilleIsNotNull()
                .stream()
                .map(adresseMapper::todto)
                .collect(Collectors.toList());
    }

}
