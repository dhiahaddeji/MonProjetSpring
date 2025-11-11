package tn.esprit.tpcafe_eyahamami.mapper;

import org.mapstruct.Mapper;
import tn.esprit.tpcafe_eyahamami.dto.Commande.CommandRequete;
import tn.esprit.tpcafe_eyahamami.dto.Commande.CommandResponse;
import tn.esprit.tpcafe_eyahamami.entities.Commande;

import java.util.List;

@Mapper(componentModel = "spring")

public interface CommandeMapper {
    Commande toentity(CommandRequete commandeRequete);
    CommandResponse toDTO(Commande commande);
    List<Commande> toentityList(List<CommandRequete> commandeList);
    List<CommandResponse> toDTOList(List<Commande> commandeList);
}
