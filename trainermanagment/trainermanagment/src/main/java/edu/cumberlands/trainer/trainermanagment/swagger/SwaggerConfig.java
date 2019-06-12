package edu.cumberlands.trainer.trainermanagment.swagger;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import edu.cumberlands.trainer.trainermanagment.TrainermanagmentApplication;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@ComponentScan(basePackageClasses = TrainermanagmentApplication.class)
@PropertySource("classpath:swagger.properties")
@Configuration
public class SwaggerConfig {
	
	private static final String SWAGGER_API_VSERION = "1.0";
	private static final String LICENSE_TEXT = "License";
	private static final String title = "Trainer Rest API";
	private static final String description  = "RESTful API for Trainer";
	
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title(title)
				.description(description)
				.license(LICENSE_TEXT)
				.version(SWAGGER_API_VSERION)
				.build();
	}
	
	public Docket trainerApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.pathMapping("/")
				.select()
				.paths(PathSelectors.regex("/trainer.*"))
				.build();
	}
}
