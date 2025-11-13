package tn.esprit.TPCafe_dhia_haddeji.resController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.TPCafe_dhia_haddeji.dto.DetailCommande.DetailCommandeRequtes;
import tn.esprit.TPCafe_dhia_haddeji.dto.DetailCommande.DetailCommandeResponse;
import tn.esprit.TPCafe_dhia_haddeji.services.DetailCommande.IDetailCommandeService;


import java.util.List;

@Tag(name = "Gestion des Détails de Commande", description = "API CRUD pour la gestion des détails de commande")
@RestController
@RequestMapping("detailcommande")
@AllArgsConstructor
public class DetailCommandeRestController {

    private IDetailCommandeService detailCommandeService;

    @Operation(summary = "Récupérer tous les détails de commande", description = "Retourne la liste complète de tous les détails de commande")
    @GetMapping
    public List<DetailCommandeResponse> selectAllDetailCommande() {
        return detailCommandeService.selectAllDetailCommande();
    }

    @Operation(summary = "Ajouter un nouveau détail de commande", description = "Crée un nouveau détail de commande dans le système")
    @PostMapping
    public DetailCommandeResponse addDetailCommande(@RequestBody DetailCommandeRequtes detailCommande) {
        return detailCommandeService.addDetailCommande(detailCommande);
    }

    @Operation(summary = "Ajouter une liste de détails de commande", description = "Ajoute plusieurs détails de commande en une seule opération")
    @PostMapping("/list")
    public List<DetailCommandeResponse> addDetailCommandes(@RequestBody List<DetailCommandeRequtes> detailCommandes) {
        return detailCommandeService.saveDetailCommande(detailCommandes);
    }

    @Operation(summary = "Récupérer un détail de commande par ID avec paramètre", description = "Retourne un détail de commande spécifique selon son identifiant (via paramètre)")
    @GetMapping("/selectById2")
    public DetailCommandeResponse selectDetailCommandeById2(@RequestParam long id) {
        return detailCommandeService.selectDetailCommandeById(id);
    }

    @Operation(summary = "Récupérer un détail de commande par ID avec chemin", description = "Retourne un détail de commande spécifique selon son identifiant (via chemin)")
    @GetMapping("selectByID/{id}")
    public DetailCommandeResponse selectDetailCommandeByID(@PathVariable long id) {
        return detailCommandeService.selectDetailCommandeById(id);
    }

    @Operation(summary = "Supprimer un détail de commande", description = "Supprime un détail de commande en le passant dans le corps de la requête")
    @DeleteMapping("/del")
    public void deleteDetailCommande(@RequestBody DetailCommandeRequtes detailCommande) {
        detailCommandeService.deleteDetailCommande(detailCommande);
    }

    @Operation(summary = "Supprimer un détail de commande par ID", description = "Supprime un détail de commande spécifique selon son identifiant")
    @DeleteMapping("delete/{id}")
    public void deleteDetailCommandeByID(@PathVariable long id) {
        detailCommandeService.deleteDetailCommandeById(id);
    }

    @Operation(summary = "Supprimer tous les détails de commande", description = "Vide complètement la liste des détails de commande")
    @DeleteMapping("all")
    public void deleteAllDetailCommandes() {
        detailCommandeService.deleteAllDetailCommande();
    }

    @Operation(summary = "Compter le nombre de détails de commande", description = "Retourne le nombre total de détails de commande dans le système")
    @GetMapping("count")
    public long countDetailCommande() {
        return detailCommandeService.countingDetailCommande();
    }

    @Operation(summary = "Vérifier l'existence d'un détail de commande", description = "Retourne true si un détail de commande existe avec l'ID spécifié, false sinon")
    @GetMapping("exist/{id}")
    public boolean existDetailCommande(@PathVariable long id) {
        return detailCommandeService.verifyDetailCommandeById(id);
    }
}