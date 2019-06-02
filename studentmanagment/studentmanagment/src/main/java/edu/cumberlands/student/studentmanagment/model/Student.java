package edu.cumberlands.student.studentmanagment.model;



import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	
	private String firstName;
	
	private String lastName;
	
	private Date DOB;
	
	private Long phoneNumber;
	
	private String email;
	
//	private List<Address> addresses; 
	
	

}
