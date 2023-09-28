FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/AppLearningg-0.0.1-SNAPSHOT.jar AppLearningg.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","AppLearningg.jar"]



# Usamos una imagen base de Java 17
#FROM openjdk:17

# Establecemos el directorio de trabajo en /app
#WORKDIR /app
#VOLUME /tmp

# Expone el puerto en el que se ejecuta tu aplicación Spring Boot
#EXPOSE 8080

#COPY target/AppLearningg-0.0.1-SNAPSHOT.jar AppLearningg.jar

#ENTRYPOINT ["java","-jar","/app.jar"]


# Copiamos el archivo JAR de tu aplicación Maven al contenedor
#COPY target/AppLearningg-0.0.1-SNAPSHOT.jar app.jar


# Comando para ejecutar la aplicación cuando se inicie el contenedor
#CMD ["java", "-jar", "app.jar"]

#intentooo