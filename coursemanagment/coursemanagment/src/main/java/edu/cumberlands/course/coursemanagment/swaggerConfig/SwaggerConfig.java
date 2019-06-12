package edu.cumberlands.course.coursemanagment.swaggerConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import edu.cumberlands.course.coursemanagment.CoursemanagmentApplication;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
@PropertySource("")
@ComponentScan(basePackageClasses = CoursemanagmentApplication.class)
public class SwaggerConfig {

	public static final String SWAGGER_API_VERSION = "1.0";
	public static final String License = "license";
	public static final String description = "RestFull API OF COURSE";
	public static final String title = "Course Restful API";

	public ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(title).description(description).license(License).version(SWAGGER_API_VERSION)
				.build();
	}

	public Docket courseApi() {
    	return new Docket(DocumentationType.SWAGGER_2)
    			.apiInfo(apiInfo())
				.pathMapping("/")
				.select()
				.paths(PathSelectors.regex("/batch.*"))
    			.build();		
    }
}
