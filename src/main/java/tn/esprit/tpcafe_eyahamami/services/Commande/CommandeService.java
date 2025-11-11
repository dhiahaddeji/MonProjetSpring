package tn.esprit.tpcafe_eyahamami.services.Commande;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpcafe_eyahamami.dto.Commande.CommandRequete;
import tn.esprit.tpcafe_eyahamami.dto.Commande.CommandResponse;
import tn.esprit.tpcafe_eyahamami.entities.Client;
import tn.esprit.tpcafe_eyahamami.entities.Commande;
import tn.esprit.tpcafe_eyahamami.mapper.CommandeMapper;
import tn.esprit.tpcafe_eyahamami.repositories.CommandeRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class CommandeService implements ICommandeService {
    private CommandeRepository commandeRepository;
    private CommandeMapper commandeMapper;
    @Override
    public CommandResponse addCommande(CommandRequete commande) {
        Commande C =commandeMapper.toentity(commande);
       Commande c= commandeRepository.save(C);
       return commandeMapper.toDTO(c);
    }

    @Override
    public List<CommandResponse> saveCommandes(List<CommandRequete> commandes) {
        List<Commande>list = commandeMapper.toentityList(commandes);
        List<Commande>lists= commandeRepository.saveAll(list);
        return commandeMapper.toDTOList(lists);
    }

    @Override
    public CommandResponse selectCommandeById(long id) {
        Commande C= commandeRepository.findById(id).get();
        return commandeMapper.toDTO(C);
    }

    @Override
    public List<CommandResponse> selectAllCommandes() {
        List<Commande> list = commandeRepository.findAll();
        return commandeMapper.toDTOList(list);
    }

    @Override
    public void deleteCommande(CommandRequete commande) {
        Commande C = commandeMapper.toentity(commande);
        commandeRepository.delete(C);

    }

    @Override
    public void deleteAllCommandes() {
        commandeRepository.deleteAll();

    }

    @Override
    public void deleteCommandeById(long id) {
        commandeRepository.deleteById(id);

    }

    @Override
    public long countingCommandes() {
        return commandeRepository.count();
    }

    @Override
    public boolean verifyCommandeById(long id) {
        return commandeRepository.existsById(id);
    }
}
