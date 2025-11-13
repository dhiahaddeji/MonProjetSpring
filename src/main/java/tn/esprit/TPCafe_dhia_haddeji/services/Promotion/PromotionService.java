package tn.esprit.TPCafe_dhia_haddeji.services.Promotion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.TPCafe_dhia_haddeji.dto.Promotion.PromotionRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.Promotion.PromotionResponse;
import tn.esprit.TPCafe_dhia_haddeji.entities.Promotion;
import tn.esprit.TPCafe_dhia_haddeji.mapper.PromotionMapper;
import tn.esprit.TPCafe_dhia_haddeji.repositories.PromotionRepository;


import java.util.List;
@Service
@AllArgsConstructor

public class PromotionService implements IPromotionService{
    private PromotionRepository promotionRepository;
    private PromotionMapper promotionMapper;
    @Override
    public PromotionResponse addPromotion(PromotionRequete promotion) {
        Promotion P = promotionMapper.toentity(promotion);
        Promotion p= promotionRepository.save(P);
        return promotionMapper.toDto(p);
    }

    @Override
    public List<PromotionResponse> savePromotion(List<PromotionRequete> promotions) {
        List<Promotion> list = promotionMapper.toentity1(promotions);
        List<Promotion> l= promotionRepository.saveAll(list);
        return promotionMapper.toDto1(l);
    }

    @Override
    public PromotionResponse selectPromotionById(long id) {
        Promotion p= promotionRepository.findById(id).get();
        return promotionMapper.toDto(p);
    }

    @Override
    public List<PromotionResponse> selectAllPromotion() {
        List<Promotion> list =promotionRepository.findAll();
        return promotionMapper.toDto1(list);
    }

    @Override
    public void deletePromotionById(long id) {
        promotionRepository.deleteById(id);

    }

    @Override
    public void deleteAllPromotion() {
        promotionRepository.deleteAll();

    }

    @Override
    public void deletePromotion(PromotionRequete promotion) {
        Promotion p= promotionMapper.toentity(promotion);
        promotionRepository.delete(p);

    }

    @Override
    public long countingPromotion() {
        return promotionRepository.count();
    }

    @Override
    public boolean verifyPromotionById(long id) {
        return promotionRepository.existsById(id);
    }
}
