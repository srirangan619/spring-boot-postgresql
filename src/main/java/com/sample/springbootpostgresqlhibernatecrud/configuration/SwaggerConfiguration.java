package com.sample.springbootpostgresqlhibernatecrud.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
public class SwaggerConfiguration {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sample.springbootpostgresqlhibernatecrud.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo getApiInfo(){
        Contact contact = new Contact("Anonymous", "www.nowhere.com", "dontContact@cantfind.com");

        String version = "1.0.0";

        return new ApiInfoBuilder()
                .title("Microservice")
                .description("An API to handle")
                .version(version)
                .license("")
                .licenseUrl("http://www.apache.org/license/LICENSE-2.0")
                .contact(contact)
                .build();
    }
}
