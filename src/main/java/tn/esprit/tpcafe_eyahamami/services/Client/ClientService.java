package tn.esprit.tpcafe_eyahamami.services.Client;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpcafe_eyahamami.dto.Client.ClientRequete;
import tn.esprit.tpcafe_eyahamami.dto.Client.ClientResponse;
import tn.esprit.tpcafe_eyahamami.entities.Client;
import tn.esprit.tpcafe_eyahamami.mapper.ClientMapper;
import tn.esprit.tpcafe_eyahamami.repositories.ClientRepository;

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
}
