package tn.esprit.TPCafe_dhia_haddeji.services.Commande;


import tn.esprit.TPCafe_dhia_haddeji.dto.Commande.CommandRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.Commande.CommandResponse;

import java.util.List;

public interface ICommandeService {
    CommandResponse addCommande(CommandRequete commande);
    List<CommandResponse>saveCommandes(List<CommandRequete> commandes);
    public CommandResponse selectCommandeById(long id);
    List<CommandResponse> selectAllCommandes();
    void deleteCommande(CommandRequete commande);
    void deleteAllCommandes();
    void deleteCommandeById(long id);
    long countingCommandes();
    boolean verifyCommandeById(long id);
}
