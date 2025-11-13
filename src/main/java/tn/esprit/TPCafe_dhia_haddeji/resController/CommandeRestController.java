package tn.esprit.TPCafe_dhia_haddeji.resController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.TPCafe_dhia_haddeji.dto.Commande.CommandRequete;
import tn.esprit.TPCafe_dhia_haddeji.dto.Commande.CommandResponse;
import tn.esprit.TPCafe_dhia_haddeji.services.Commande.ICommandeService;


import java.util.List;

@Tag(name = "Gestion des Commandes", description = "API CRUD pour la gestion des commandes")
@RestController
@RequestMapping("commande")
@AllArgsConstructor
public class CommandeRestController {

    private ICommandeService commandeService;

    @Operation(summary = "Récupérer toutes les commandes", description = "Retourne la liste complète de toutes les commandes")
    @GetMapping
    public List<CommandResponse> selectAllCommande() {
        return commandeService.selectAllCommandes();
    }

    @Operation(summary = "Ajouter une nouvelle commande", description = "Crée une nouvelle commande dans le système")
    @PostMapping
    public CommandResponse addCommande(@RequestBody CommandRequete commande) {
        return commandeService.addCommande(commande);
    }

    @Operation(summary = "Ajouter une liste de commandes", description = "Ajoute plusieurs commandes en une seule opération")
    @PostMapping("/list")
    public List<CommandResponse> addCommandes(@RequestBody List<CommandRequete> commandes) {
        return commandeService.saveCommandes(commandes);
    }

    @Operation(summary = "Récupérer une commande par ID avec paramètre", description = "Retourne une commande spécifique selon son identifiant (via paramètre)")
    @GetMapping("/selectById2")
    public CommandResponse selectCommandeById2(@RequestParam long id) {
        return commandeService.selectCommandeById(id);
    }

    @Operation(summary = "Récupérer une commande par ID avec chemin", description = "Retourne une commande spécifique selon son identifiant (via chemin)")
    @GetMapping("selectByID/{id}")
    public CommandResponse selectCommandeByID(@PathVariable long id) {
        return commandeService.selectCommandeById(id);
    }

    @Operation(summary = "Supprimer une commande", description = "Supprime une commande en la passant dans le corps de la requête")
    @DeleteMapping("/del")
    public void deleteCommande(@RequestBody CommandRequete commande) {
        commandeService.deleteCommande(commande);
    }

    @Operation(summary = "Supprimer une commande par ID", description = "Supprime une commande spécifique selon son identifiant")
    @DeleteMapping("delete/{id}")
    public void deleteCommandeByID(@PathVariable long id) {
        commandeService.deleteCommandeById(id);
    }

    @Operation(summary = "Supprimer toutes les commandes", description = "Vide complètement la liste des commandes")
    @DeleteMapping("all")
    public void deleteAllCommandes() {
        commandeService.deleteAllCommandes();
    }

    @Operation(summary = "Compter le nombre de commandes", description = "Retourne le nombre total de commandes dans le système")
    @GetMapping("count")
    public long countCommandes() {
        return commandeService.countingCommandes();
    }

    @Operation(summary = "Vérifier l'existence d'une commande", description = "Retourne true si une commande existe avec l'ID spécifié, false sinon")
    @GetMapping("exist/{id}")
    public boolean existCommande(@PathVariable long id) {
        return commandeService.verifyCommandeById(id);
    }
}