package edu.cumberlands.course.coursemanagment.model;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;
	
	private String name;
	
	private Integer duration;
	
	private Double cost;
	
	private Date startDate;
	
	private Date endDate;

}
