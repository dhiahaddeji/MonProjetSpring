package tn.esprit.TPCafe_dhia_haddeji.services.Promotion;


import tn.esprit.TPCafe_dhia_haddeji.dto.Promotion.PromotionRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.Promotion.PromotionResponse;

import java.util.List;

public interface IPromotionService {
    PromotionResponse addPromotion(PromotionRequete promotion);
    List<PromotionResponse> savePromotion(List<PromotionRequete> promotions);
    public PromotionResponse selectPromotionById(long id);
    List<PromotionResponse> selectAllPromotion();
    void deletePromotionById(long id);
    void deleteAllPromotion();
    void deletePromotion(PromotionRequete promotion);
    long countingPromotion();
    boolean verifyPromotionById(long id);
}
