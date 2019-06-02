package edu.cumberlands.course.coursemanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CoursemanagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursemanagmentApplication.class, args);
	}

}
