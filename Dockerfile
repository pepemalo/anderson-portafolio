# Usamos una imagen base de Java 17
FROM openjdk:17

# Establecemos el directorio de trabajo en /app
WORKDIR /app

# Copiamos el archivo JAR de tu aplicación Maven al contenedor
COPY target/AppLearningg-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que se ejecuta tu aplicación Spring Boot
EXPOSE 8080

# Comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "app.jar"]

#intentooo