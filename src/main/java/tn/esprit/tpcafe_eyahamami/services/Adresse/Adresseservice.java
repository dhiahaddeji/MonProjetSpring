package tn.esprit.tpcafe_eyahamami.services.Adresse;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpcafe_eyahamami.dto.Adresse.AdresseReponse;
import tn.esprit.tpcafe_eyahamami.dto.Adresse.AdresseRequest;
import tn.esprit.tpcafe_eyahamami.entities.Adresse;
import tn.esprit.tpcafe_eyahamami.mapper.AdresseMapper;
import tn.esprit.tpcafe_eyahamami.repositories.AdresseRepository;

import java.util.List;
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
}
