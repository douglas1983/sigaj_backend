package br.net.at2d.sigaj;

import java.util.Arrays;

import org.springdoc.core.SpringDocUtils;
import org.springdoc.core.converters.models.Pageable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@SpringBootApplication
public class SigajApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigajApplication.class, args);
	}

	@Bean
	public OpenAPI springEventLogOpenAPI() {
		SpringDocUtils.getConfig().replaceWithClass(org.springframework.data.domain.Pageable.class, Pageable.class);
		return new OpenAPI()
				.info(new Info().title("Sigaj API").description("API para SIGAJ").version("v0.0.1")
						.license(new License().name("Apache	2.0").url("http://springdoc.org")))
				.components(new Components()
						.addSecuritySchemes("TOKEN",
								new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")
										.in(SecurityScheme.In.HEADER).name("Authorization"))
						.addSecuritySchemes("basicScheme", new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))

				.addSecurityItem(new SecurityRequirement().addList("TOKEN", Arrays.asList("read", "write")));

	}
}
