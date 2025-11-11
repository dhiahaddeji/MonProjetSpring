package tn.esprit.tpcafe_eyahamami.mapper;

import org.mapstruct.Mapper;
import tn.esprit.tpcafe_eyahamami.dto.Promotion.PromotionRequete;
import tn.esprit.tpcafe_eyahamami.dto.Promotion.PromotionResponse;
import tn.esprit.tpcafe_eyahamami.entities.Promotion;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PromotionMapper {
    Promotion toentity(PromotionRequete promotion);
    PromotionResponse toDto(Promotion promotion);

    List<Promotion>toentity1(List<PromotionRequete> promotion);
    List<PromotionResponse> toDto1(List<Promotion> promotion);
}
