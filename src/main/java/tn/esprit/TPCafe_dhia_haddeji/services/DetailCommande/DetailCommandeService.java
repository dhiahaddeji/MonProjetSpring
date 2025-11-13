package tn.esprit.TPCafe_dhia_haddeji.services.DetailCommande;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.TPCafe_dhia_haddeji.dto.DetailCommande.DetailCommandeRequtes;
import tn.esprit.TPCafe_dhia_haddeji.dto.DetailCommande.DetailCommandeResponse;
import tn.esprit.TPCafe_dhia_haddeji.entities.DetailCommande;
import tn.esprit.TPCafe_dhia_haddeji.mapper.DetailCommandeMapper;
import tn.esprit.TPCafe_dhia_haddeji.repositories.DetailCommandeRepository;


import java.util.List;
@Service
@AllArgsConstructor

public class DetailCommandeService  implements IDetailCommandeService{
    private DetailCommandeRepository detailCommandeRepository;
    private DetailCommandeMapper detailCommandeMapper;
    @Override
    public DetailCommandeResponse addDetailCommande(DetailCommandeRequtes detailCommande) {
        DetailCommande D = detailCommandeMapper.toEntity(detailCommande);
        DetailCommande d= detailCommandeRepository.save(D);
        return detailCommandeMapper.toDto(d);
    }

    @Override
    public List<DetailCommandeResponse> saveDetailCommande(List<DetailCommandeRequtes> detailCommandes) {
        List<DetailCommande>list=detailCommandeMapper.toEntity1(detailCommandes);
        List<DetailCommande>D= detailCommandeRepository.saveAll(list);
        return detailCommandeMapper.toDto1(D);
    }

    @Override
    public DetailCommandeResponse selectDetailCommandeById(long id) {
        DetailCommande d = detailCommandeRepository.findById(id).get();
        return detailCommandeMapper.toDto(d);
    }

    @Override
    public List<DetailCommandeResponse> selectAllDetailCommande() {
        List<DetailCommande> list =detailCommandeRepository.findAll();
        return detailCommandeMapper.toDto1(list);
    }

    @Override
    public void deleteDetailCommande(DetailCommandeRequtes detailCommande) {
        DetailCommande D = detailCommandeMapper.toEntity(detailCommande);
        detailCommandeRepository.delete(D);

    }

    @Override
    public void deleteAllDetailCommande() {
        detailCommandeRepository.deleteAll();

    }

    @Override
    public void deleteDetailCommandeById(long id) {
        detailCommandeRepository.deleteById(id);

    }

    @Override
    public long countingDetailCommande() {
        return detailCommandeRepository.count();
    }

    @Override
    public boolean verifyDetailCommandeById(long id) {
        return detailCommandeRepository.existsById(id);
    }
}
