package tn.esprit.tpcafe_eyahamami.mapper;

import org.mapstruct.Mapper;
import tn.esprit.tpcafe_eyahamami.dto.DetailCommande.DetailCommandeRequtes;
import tn.esprit.tpcafe_eyahamami.dto.DetailCommande.DetailCommandeResponse;
import tn.esprit.tpcafe_eyahamami.entities.DetailCommande;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DetailCommandeMapper {
    DetailCommande toEntity(DetailCommandeRequtes detailCommandeRequtes);
    DetailCommandeResponse toDto(DetailCommande detailCommande);

    List<DetailCommandeResponse> toDto1(List<DetailCommande> detailCommandeList);
    List<DetailCommande>toEntity1(List<DetailCommandeRequtes> detailCommandeRequteses);
}
