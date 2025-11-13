package tn.esprit.TPCafe_dhia_haddeji.services.Client;


import tn.esprit.TPCafe_dhia_haddeji.dto.Client.ClientRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.Client.ClientResponse;

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
