package tn.esprit.TPCafe_dhia_haddeji.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        String mdDescription = """
               

                ### 🎯 Objectif du projet
                Ce projet **Spring Boot** a pour but de gérer la commande et la gestion des articles d’un café.  
                Il illustre l’utilisation de *Spring Data JPA*, *REST API* et *Swagger OpenAPI*.

                ---

                ### 📘 Fonctionnalités principales
                - ✅ Gestion des **articles** (CRUD complet)  
                - ☕ Gestion des **commandes** et des **clients**  
                - 💻 Interface interactive via **Swagger UI**

                ---

                ### 👩‍💻 À propos
                Développé par **Eya Hamami** dans le cadre du module *Architecture des Systèmes d’Information (ASI II)*.  
                Pour plus d’informations ou pour me contacter :

                 
                
                """;

        return new OpenAPI()
                .info(new Info()
                        .title("☕ TP Café - Eya Hamami")
                        .description(mdDescription)
                        .version("1.0")
                        .contact(new Contact()
                                .name("Equipe ASI II")
                                .email("📧 **Email** : [Eya.Hamami@esprit.tn](mailto:Eya.Hamami@esprit.tn)" )
                                .url("🔗 **LinkedIn** : [Profil professionnel](https://www.linkedin.com/in/**********/)"))
                );
    }
    @Bean
    public GroupedOpenApi allApis() {
        return GroupedOpenApi.builder()
                .group("Toutes les APIs")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public GroupedOpenApi articlesApi() {
        return GroupedOpenApi.builder()
                .group("Articles")
                .pathsToMatch("/article/**")
                .build();
    }

    @Bean
    public GroupedOpenApi clientsApi() {
        return GroupedOpenApi.builder()
                .group("Clients")
                .pathsToMatch("/client/**")
                .build();
    }

    @Bean
    public GroupedOpenApi commandesApi() {
        return GroupedOpenApi.builder()
                .group("Commandes")
                .pathsToMatch("/commande/**")
                .build();
    }

    @Bean
    public GroupedOpenApi detailsCommandeApi() {
        return GroupedOpenApi.builder()
                .group("Détails Commande")
                .pathsToMatch("/detailcommande/**")
                .build();
    }

    @Bean
    public GroupedOpenApi promotionsApi() {
        return GroupedOpenApi.builder()
                .group("Promotions")
                .pathsToMatch("/promotion/**")
                .build();
    }

    @Bean
    public GroupedOpenApi cartesFideliteApi() {
        return GroupedOpenApi.builder()
                .group("Cartes Fidélité")
                .pathsToMatch("/cartefidelite/**")
                .build();
    }

    @Bean
    public GroupedOpenApi adressesApi() {
        return GroupedOpenApi.builder()
                .group("Adresses")
                .pathsToMatch("/adresse/**")
                .build();
    }
}
