package edu.cumberlands.batch.batchmanagment.swaggerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import edu.cumberlands.batch.batchmanagment.BatchmanagmentApplication;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
@ComponentScan(basePackageClasses = BatchmanagmentApplication.class)
@PropertySource("classpath:swagger.properties")
public class SwaggerConfig {

	public static final String SWAGGER_API_VERSION = "1.0";
	public static final String LICENSE_TEXT = "LICENSE";
	public static final String title = "BATCH Restful API";
	public static final String description = "RESTful API for BATCH";
	
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title(title)
				.license(LICENSE_TEXT)
				.description(description)
				.version(SWAGGER_API_VERSION)
				.build();
	}
	
	@Bean
	public Docket batchApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.pathMapping("/")
				.select()
				.paths(PathSelectors.regex("/student.*"))
				.build();
	}
	
}
