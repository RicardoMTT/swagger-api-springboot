# Usa una imagen base de Java (puedes usar 17 o la que uses en tu proyecto)
FROM openjdk:17-jdk-slim

# Crea el directorio donde irá la app
WORKDIR /app

# Copia el .jar generado en el contenedor en un archivo app.jar que sera el nombre del archivo dentro del contenedor
COPY target/prueba-swagger-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto en el que corre tu app (según tu application.properties)
EXPOSE 8001

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]
