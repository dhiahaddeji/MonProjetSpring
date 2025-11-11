package tn.esprit.tpcafe_eyahamami.resController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpcafe_eyahamami.dto.Client.ClientRequete;
import tn.esprit.tpcafe_eyahamami.dto.Client.ClientResponse;
import tn.esprit.tpcafe_eyahamami.entities.Client;
import tn.esprit.tpcafe_eyahamami.services.Client.IClientService;

import java.util.List;

@Tag(name = "Gestion des Clients", description = "API CRUD pour la gestion des clients")
@RestController
@RequestMapping("client")
@AllArgsConstructor
public class ClientRestController {

    private IClientService clientService;

    @Operation(summary = "Récupérer tous les clients", description = "Retourne la liste complète de tous les clients")
    @GetMapping
    public List<ClientResponse> selectAllClient() {
        return clientService.selectAllClients();
    }

    @Operation(summary = "Ajouter un nouveau client", description = "Crée un nouveau client dans le système")
    @PostMapping
    public ClientResponse addClient(@RequestBody ClientRequete client) {
        return clientService.addClient(client);
    }

    @Operation(summary = "Ajouter une liste de clients", description = "Ajoute plusieurs clients en une seule opération")
    @PostMapping("/list")
    public List<ClientResponse> addClients(@RequestBody List<ClientRequete> clients) {
        return clientService.saveClients(clients);
    }

    @Operation(summary = "Récupérer un client par ID avec paramètre", description = "Retourne un client spécifique selon son identifiant (via paramètre)")
    @GetMapping("/selectById2")
    public ClientResponse selectClientById2(@RequestParam long id) {
        return clientService.selectClientById(id);
    }

    @Operation(summary = "Récupérer un client par ID avec chemin", description = "Retourne un client spécifique selon son identifiant (via chemin)")
    @GetMapping("selectByID/{id}")
    public ClientResponse selectClientByID(@PathVariable long id) {
        return clientService.selectClientById(id);
    }

    @Operation(summary = "Supprimer un client", description = "Supprime un client en le passant dans le corps de la requête")
    @DeleteMapping("/del")
    public void deleteClient(@RequestBody ClientRequete client) {
        clientService.deleteClient(client);
    }

    @Operation(summary = "Supprimer un client par ID", description = "Supprime un client spécifique selon son identifiant")
    @DeleteMapping("delete/{id}")
    public void deleteClientByID(@PathVariable long id) {
        clientService.deleteClientById(id);
    }

    @Operation(summary = "Supprimer tous les clients", description = "Vide complètement la liste des clients")
    @DeleteMapping("all")
    public void deleteAllClients() {
        clientService.deleteAllClients();
    }

    @Operation(summary = "Compter le nombre de clients", description = "Retourne le nombre total de clients dans le système")
    @GetMapping("count")
    public Long countClients() {
        return clientService.countingClients();
    }

    @Operation(summary = "Vérifier l'existence d'un client", description = "Retourne true si un client existe avec l'ID spécifié, false sinon")
    @GetMapping("exist/{id}")
    public Boolean existClient(@PathVariable long id) {
        return clientService.verifyClientById(id);
    }
}