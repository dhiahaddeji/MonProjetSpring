package tn.esprit.tpcafe_eyahamami.services.DetailCommande;

import tn.esprit.tpcafe_eyahamami.dto.DetailCommande.DetailCommandeRequtes;
import tn.esprit.tpcafe_eyahamami.dto.DetailCommande.DetailCommandeResponse;
import tn.esprit.tpcafe_eyahamami.entities.DetailCommande;

import java.util.List;

public interface IDetailCommandeService {
    DetailCommandeResponse addDetailCommande(DetailCommandeRequtes detailCommande);
    List<DetailCommandeResponse>  saveDetailCommande(List<DetailCommandeRequtes> detailCommandes);
    public DetailCommandeResponse selectDetailCommandeById(long id);
     List<DetailCommandeResponse> selectAllDetailCommande();
     void deleteDetailCommande(DetailCommandeRequtes detailCommande);
     void deleteAllDetailCommande();
     void deleteDetailCommandeById(long id);
     long countingDetailCommande();
     boolean verifyDetailCommandeById(long id);

}
