package edu.cumberlands.batch.batchmanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
//@EnableEurekaClient
public class BatchmanagmentApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BatchmanagmentApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BatchmanagmentApplication.class);
    }
}
