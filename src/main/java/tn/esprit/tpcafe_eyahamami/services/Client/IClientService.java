package tn.esprit.tpcafe_eyahamami.services.Client;

import tn.esprit.tpcafe_eyahamami.dto.Client.ClientRequete;
import tn.esprit.tpcafe_eyahamami.dto.Client.ClientResponse;
import tn.esprit.tpcafe_eyahamami.entities.Client;

import java.util.List;

public interface IClientService {
    ClientResponse addClient(ClientRequete client);
    List<ClientResponse> saveClients(List<ClientRequete> clients);
    public ClientResponse selectClientById(long id);
    List<ClientResponse> selectAllClients();
    void deleteClient(ClientRequete client);
    void deleteAllClients();
    void deleteClientById(long id);
    long countingClients();
    boolean verifyClientById(long id);

}
