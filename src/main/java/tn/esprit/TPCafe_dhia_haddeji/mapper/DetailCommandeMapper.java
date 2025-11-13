package tn.esprit.TPCafe_dhia_haddeji.mapper;

import org.mapstruct.Mapper;
import tn.esprit.TPCafe_dhia_haddeji.dto.DetailCommande.DetailCommandeRequtes;
import tn.esprit.TPCafe_dhia_haddeji.dto.DetailCommande.DetailCommandeResponse;
import tn.esprit.TPCafe_dhia_haddeji.entities.DetailCommande;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DetailCommandeMapper {
    DetailCommande toEntity(DetailCommandeRequtes detailCommandeRequtes);
    DetailCommandeResponse toDto(DetailCommande detailCommande);

    List<DetailCommandeResponse> toDto1(List<DetailCommande> detailCommandeList);
    List<DetailCommande>toEntity1(List<DetailCommandeRequtes> detailCommandeRequteses);
}
