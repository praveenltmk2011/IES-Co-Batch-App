package com.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket EDRulesApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("ED-RULES-API")
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ashokit.rest"))
				//.paths(PathSelectors.any())
				.build();
	
	}
	
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Integrated Eligibility System")
				.description("ED-Rules-Api Document for Developers")
				.termsOfServiceUrl("U.S Govt.")
				.contact("U.S Federal Govt")
				.license("U.S Government")
				.licenseUrl("usfederalgovt.help@us.com")
				.version("1.0")
				.build();
	}
}
