package edu.cumberlands.student.studentmanagment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class) })
	public ResponseEntity<?> saveStudent(@RequestBody Student student) {
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if (null != student) {
			map.put("Student saved", studentService.saveStudent(student));
			response = new ResponseEntity<>(map, HttpStatus.OK);
		} else {
			map.put("Student not saved", "Check the input");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	@GetMapping("/get/{studentId}")
	@ApiOperation("Getting the Student based on the ID provided")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class) })
	public ResponseEntity<?> getStudent(@PathVariable Long studentId) {
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if (null != studentId) {
			map.put("Students detail Requested", studentService.getStudent(studentId));
			response = new ResponseEntity<>(map, HttpStatus.OK);
		} else {
			map.put("No results found", "Check the input");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	@GetMapping("/getAll")
	@ApiOperation("Getting List Of All Students")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class) })
	public ResponseEntity<?> getAllStudent() {
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		map.put("List of all Student", studentService.getAllStudent());
		response = new ResponseEntity<>(map, HttpStatus.OK);
		return response;
	}

	@PutMapping("/update")
	@ApiOperation("Updating student")
	@ApiResponses (value = {@ApiResponse(code = 200, message = "OK", response = ResponseEntity.class)})
	public ResponseEntity<?> updateStudent(@RequestBody Student student) {
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if (null != student) {
			map.put("Student Updated", studentService.updateStudent(student));
			response = new ResponseEntity<>(map, HttpStatus.OK);
		} else {
			map.put("No results found", "Check the input");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	@DeleteMapping("/delete/{studentId}")
	@ApiOperation("Deleteing student when studentID provided")
	@ApiResponses (value = {@ApiResponse(code = 200, message = "OK", response = ResponseEntity.class)})
	public ResponseEntity<?> deleteStudent(@PathVariable Long studentId) {
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if( null != studentId) {
			studentService.deleteStudent(studentId);
			map.put("Deleting the student", "studentID {"+studentId+"}");
			response = new ResponseEntity<>(map, HttpStatus.OK);
		}else {
			map.put("No results found", "Check the input");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return response;
	}
	
	@PostMapping("/search")
	@ApiOperation("Searching  student when FirstName or LastName or Email provided")
	@ApiResponses(value = {@ApiResponse(code= 200, message= "OK", response = ResponseEntity.class)})
	public ResponseEntity<?> searchStudent(@RequestBody Student student){
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if (null != student) {
			map.put("Search Result", studentService.searchStudent(student));
			response = new ResponseEntity<>(map, HttpStatus.OK);
		}else {
			map.put("No results found", "Check the input");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return response;
	}
}
