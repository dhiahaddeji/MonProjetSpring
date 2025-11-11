package tn.esprit.tpcafe_eyahamami.services.Promotion;

import tn.esprit.tpcafe_eyahamami.dto.Promotion.PromotionRequete;
import tn.esprit.tpcafe_eyahamami.dto.Promotion.PromotionResponse;
import tn.esprit.tpcafe_eyahamami.entities.Promotion;

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
