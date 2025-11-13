package tn.esprit.TPCafe_dhia_haddeji.mapper;

import org.mapstruct.Mapper;
import tn.esprit.TPCafe_dhia_haddeji.dto.Client.ClientRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.Client.ClientResponse;
import tn.esprit.TPCafe_dhia_haddeji.entities.Client;

import java.util.List;
@Mapper(componentModel = "spring")

public interface ClientMapper {
    ClientResponse todto(Client client);
  Client toentity(ClientRequete  clientRequete);
    List<ClientResponse> todto2(List<Client> clients);
    List<Client> toentity2(List<ClientRequete> clientRequetes);
}
