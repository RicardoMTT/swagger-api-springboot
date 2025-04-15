package com.ricardo.prueba.swagger.prueba_swagger.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Prueba con Swagger")
                        .version("1.0.0")
                        .description("Documentación generada automáticamente con Swagger y Springdoc OpenAPI 2."));
    }

}
