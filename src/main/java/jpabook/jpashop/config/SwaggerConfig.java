package jpabook.jpashop.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;


@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI swaggerApi() {
        Info info = new Info()
            .title("TODO LIST")
            .description("Todo List API")
            .version("1.0.0");

        SecurityScheme jwtSecurityScheme = new SecurityScheme()
            .type(SecurityScheme.Type.APIKEY)
            .in(SecurityScheme.In.HEADER)
            .name("Authorization");

        SecurityRequirement securityRequirement = new SecurityRequirement()
            .addList("jwt");

        return new OpenAPI()
            .components(new Components()
                .addSecuritySchemes("jwt", jwtSecurityScheme))
            .security(Collections.singletonList(securityRequirement))
            .info(info);
    }
}
