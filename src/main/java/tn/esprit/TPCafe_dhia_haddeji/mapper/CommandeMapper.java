package tn.esprit.TPCafe_dhia_haddeji.mapper;

import org.mapstruct.Mapper;
import tn.esprit.TPCafe_dhia_haddeji.dto.Commande.CommandRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.Commande.CommandResponse;
import tn.esprit.TPCafe_dhia_haddeji.entities.Commande;

import java.util.List;

@Mapper(componentModel = "spring")

public interface CommandeMapper {
    Commande toentity(CommandRequete commandeRequete);
    CommandResponse toDTO(Commande commande);
    List<Commande> toentityList(List<CommandRequete> commandeList);
    List<CommandResponse> toDTOList(List<Commande> commandeList);
}
