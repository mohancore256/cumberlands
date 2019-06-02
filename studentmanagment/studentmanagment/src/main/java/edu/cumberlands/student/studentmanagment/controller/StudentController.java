package edu.cumberlands.student.studentmanagment.controller;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import edu.cumberlands.student.studentmanagment.model.Student;
import edu.cumberlands.student.studentmanagment.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/student")
@Api(value = "Employee Controller", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	@ApiOperation("Creating the student")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "OK", response = ResponseEntity.class)})
	public ResponseEntity<?> saveStudent(Student student){
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if( null != student) {
			map.put("Student saved", studentService.saveStudent(student));
			response = new ResponseEntity<>(map, HttpStatus.OK);
		}else {
			map.put("Student not saved", "Check the input");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return response;
	}

}
