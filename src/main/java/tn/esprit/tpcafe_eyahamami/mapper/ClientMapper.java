package tn.esprit.tpcafe_eyahamami.mapper;

import org.mapstruct.Mapper;
import tn.esprit.tpcafe_eyahamami.dto.Article.ArticleRequete;
import tn.esprit.tpcafe_eyahamami.dto.Article.ArticleResponse;
import tn.esprit.tpcafe_eyahamami.dto.Client.ClientRequete;
import tn.esprit.tpcafe_eyahamami.dto.Client.ClientResponse;
import tn.esprit.tpcafe_eyahamami.entities.Article;
import tn.esprit.tpcafe_eyahamami.entities.Client;

import java.util.List;
@Mapper(componentModel = "spring")

public interface ClientMapper {
    ClientResponse todto(Client client);
  Client toentity(ClientRequete  clientRequete);
    List<ClientResponse> todto2(List<Client> clients);
    List<Client> toentity2(List<ClientRequete> clientRequetes);
}
