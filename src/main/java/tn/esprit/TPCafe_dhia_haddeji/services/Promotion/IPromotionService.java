package tn.esprit.TPCafe_dhia_haddeji.services.Promotion;


import tn.esprit.TPCafe_dhia_haddeji.dto.Promotion.PromotionRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.Promotion.PromotionResponse;
import tn.esprit.TPCafe_dhia_haddeji.entities.Promotion;

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
    void affecterPromotionAArticle(long idArticle, long idPromo);
    void desaffecterPromotionDUnArticle(long idArticle, long idPromo);
    void ajouterPromoEtAffecterAArticle(Promotion p, long idArticle);
}
