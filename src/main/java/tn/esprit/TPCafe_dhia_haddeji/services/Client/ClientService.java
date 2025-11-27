package tn.esprit.TPCafe_dhia_haddeji.services.Client;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.TPCafe_dhia_haddeji.dto.Client.ClientRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.Client.ClientResponse;
import tn.esprit.TPCafe_dhia_haddeji.entities.Adresse;
import tn.esprit.TPCafe_dhia_haddeji.entities.CarteFidelite;
import tn.esprit.TPCafe_dhia_haddeji.entities.Client;
import tn.esprit.TPCafe_dhia_haddeji.entities.Commande;
import tn.esprit.TPCafe_dhia_haddeji.mapper.ClientMapper;
import tn.esprit.TPCafe_dhia_haddeji.repositories.ClientRepository;
import tn.esprit.TPCafe_dhia_haddeji.repositories.CommandeRepository;


import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor

public class ClientService implements IClientService {
    private ClientRepository clientRepository;
    private ClientMapper clientMapper;

    @Override
    public ClientResponse addClient(ClientRequete client) {
        Client clt= clientMapper.toentity(client);

        Client savedclient=clientRepository.save(clt);
        return clientMapper.todto(savedclient);
    }

    @Override
    public List<ClientResponse> saveClients(List<ClientRequete> clients) {
        List<Client>clts=clientMapper.toentity2(clients);
        List<Client>savedclients=clientRepository.saveAll(clts);
        return clientMapper.todto2(savedclients);
    }

    @Override
    public ClientResponse selectClientById(long id) {
        Client clt= clientRepository.findById(id).get();
        return clientMapper.todto(clt);
    }

    @Override
    public List<ClientResponse> selectAllClients() {
        List<Client>clts= clientRepository.findAll();
        return clientMapper.todto2(clts);
    }

    @Override
    public void deleteClient(ClientRequete client) {
        Client clt= clientMapper.toentity(client);
        clientRepository.delete(clt);

    }

    @Override
    public void deleteAllClients() {
        clientRepository.deleteAll();

    }

    @Override
    public void deleteClientById(long id) {
        clientRepository.deleteById(id);

    }

    @Override
    public long countingClients() {
        return  clientRepository.count();
    }

    @Override
    public boolean verifyClientById(long id) {
        return clientRepository.existsById(id);
    }
    @Override
    public void ajouteCommandeEtAffecterAClient(Commande c, String nomClient, String prenomClient) {

        Client client = clientRepository.findByNomAndPrenom(nomClient, prenomClient);
        //parent -->commande ? Child -> Client ?

        // si le client n'existe pas → arrêter la méthode
        if (client == null) return;

        // initialiser la liste si elle est null
        if (client.getCommandes() == null)
            client.setCommandes(new ArrayList<>());

        // affectation
        c.setClient(client);
        client.getCommandes().add(c);

        // save car cascade
        clientRepository.save(client);
    }

    @Override
    public void ajouterEtAffecterAdresseAClient(Adresse ad, long idClient) {
        Client client = clientRepository.findById(idClient).orElse(null);
        if (client == null) return;

        client.setAdresse(ad);
        clientRepository.save(client);
    }
    @Override
    public void ajouterClienteEtCarteFidelite(CarteFidelite carte) {

        Client client = carte.getClient();


        client.setCarteFidelite(carte);

        carte.setClient(client);


        clientRepository.save(client);
    }
}
