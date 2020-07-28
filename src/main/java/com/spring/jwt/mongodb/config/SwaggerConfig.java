package com.spring.jwt.mongodb.config;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				 .forCodeGeneration(true)
			        .globalOperationParameters(globalParameterList()) 
			// ^ here we are passing the global paramters to inlcude in swagger-ui
			        .apiInfo(apiInfo())    .select()
			        .apis( RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.paths(postPaths()).build();
	}
	 private List<Parameter> globalParameterList() {

		    Parameter authTokenHeader =
		        new ParameterBuilder()
		            .name("Authorization") // name of the header
		            .modelRef(new ModelRef("string")) // data-type of the header
		            .required(true) // required/optional
		            .parameterType("header") // for query-param, this value can be 'query'
		            .description("Bearer Auth Token")
		            .build();

		    return Collections.singletonList(authTokenHeader);
		  }
	private Predicate<String> postPaths() {
		return or(regex("/api/test.*"), regex("/api/test.*"));
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("sekar ecommerce API")
				.description("sekar ecommerce API reference for developers")
//				.termsOfServiceUrl("http://javainuse.com")
	//			.contact("javainuse@gmail.com").license("JavaInUse License")
				.licenseUrl("javainuse@gmail.com").version("1.0").build();
	}

}
