package com.itau.api.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Data
@ConfigurationProperties("app.api")
@ConditionalOnProperty(name="app.api.swagger.enable", havingValue = "true", matchIfMissing = false)
public class SwaggerConfig {

	private String version;
	private String title;
	private String description;
   	private String basePackage;
   	private String contactName;
   	private String contactEmail;

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage(basePackage))
				.paths(PathSelectors.any())
				.build()		
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
				return new ApiInfoBuilder()
					.title(title)
					.description(description)
					.version(version)
					.contact(new Contact(contactName, null, contactEmail))
					.build();
	}
}
