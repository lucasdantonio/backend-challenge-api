package com.lucas.ApiRest.config;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

@Configuration @EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket filmeApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.lucas.ApiRest"))
				.paths(regex("/api.*"))
				.build()
				.apiInfo(metaInfo());
	}
	
	@SuppressWarnings("rawtypes")
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"BackEnd Challenge",
				"API REST",
				"0.1",
				"Terms of Service",
				new Contact(
						"Lucas D'Antonio",
						"http://github.com/lucasdantonio/backend-challenge-api",
						"lucasdantonio14@gmail.com"),
				"Linkedin",
				"https://www.linkedin.com/in/lucas-d-antonio-navarro-de-andrade-8301a515b/",
				new ArrayList<VendorExtension>()
				);
		return apiInfo;
	}
}
