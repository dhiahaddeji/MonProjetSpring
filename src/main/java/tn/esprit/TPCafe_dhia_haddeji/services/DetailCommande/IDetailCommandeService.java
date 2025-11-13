package tn.esprit.TPCafe_dhia_haddeji.services.DetailCommande;



import tn.esprit.TPCafe_dhia_haddeji.dto.DetailCommande.DetailCommandeRequtes;
import tn.esprit.TPCafe_dhia_haddeji.dto.DetailCommande.DetailCommandeResponse;

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
