package tn.esprit.TPCafe_dhia_haddeji.mapper;

import org.mapstruct.Mapper;
import tn.esprit.TPCafe_dhia_haddeji.dto.Promotion.PromotionRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.Promotion.PromotionResponse;
import tn.esprit.TPCafe_dhia_haddeji.entities.Promotion;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PromotionMapper {
    Promotion toentity(PromotionRequete promotion);
    PromotionResponse toDto(Promotion promotion);

    List<Promotion>toentity1(List<PromotionRequete> promotion);
    List<PromotionResponse> toDto1(List<Promotion> promotion);
}
