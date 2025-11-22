FROM eclipse-temurin:17-jdk

# Dossier interne unique pour toi
WORKDIR /dhia_app

# Copie ton propre jar
COPY target/*.jar dhia-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "dhia-app.jar"]
