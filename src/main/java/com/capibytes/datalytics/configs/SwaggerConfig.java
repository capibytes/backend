package com.capibytes.datalytics.configs;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI().components(new Components())
                .addServersItem(new Server().url("http://localhost:8080").description("Servidor local de desenvolvimento"))
                .info(new Info()
                        .title("Datalytics")
                        .description("Api de gerenciamento entre consultores e clientes sobre governança de dados")
                        .version("v1.0.0"));
    }

}