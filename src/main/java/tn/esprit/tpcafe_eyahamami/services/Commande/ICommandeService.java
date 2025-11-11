package tn.esprit.tpcafe_eyahamami.services.Commande;

import tn.esprit.tpcafe_eyahamami.dto.Commande.CommandRequete;
import tn.esprit.tpcafe_eyahamami.dto.Commande.CommandResponse;
import tn.esprit.tpcafe_eyahamami.entities.Commande;

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
