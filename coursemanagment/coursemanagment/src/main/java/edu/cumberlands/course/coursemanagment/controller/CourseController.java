package edu.cumberlands.course.coursemanagment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cumberlands.course.coursemanagment.model.Course;
import edu.cumberlands.course.coursemanagment.service.CourseService;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping("/save")
	public ResponseEntity<?> saveCourse(@RequestBody Course course) {
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if (null != course) {
			map.put("Course Saved", courseService.saveCourse(course));
			response = new ResponseEntity<>(map, HttpStatus.OK);
		} else {
			map.put("Course not Saved", "OOPS something went wrong");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	@DeleteMapping("/delete/{courseId}")
	public ResponseEntity<?> deleteCourse(@PathVariable Long courseId) {
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if (null != courseId) {
			courseService.deleteCourse(courseId);
			map.put("Delete Course", "Delete id");
			response = new ResponseEntity<>(map, HttpStatus.OK);
		} else {
			map.put("Bad Request", "Check for input");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	@GetMapping("/get/{courseId}")
	public ResponseEntity<?> getCourse(@PathVariable Long courseId) {
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if (null != courseId) {
			map.put("Course details request", courseService.getCourse(courseId));
			response = new ResponseEntity<>(map, HttpStatus.OK);
		} else {
			map.put("Bad Request", "Check for input");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAllCourse() {
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		map.put("List Course", courseService.getAllCourses());
		response = new ResponseEntity<>(map, HttpStatus.OK);
		return response;
	}

	@PostMapping("/update")
	public ResponseEntity<?> updateCourse(@RequestBody Course course) {
		ModelMap map = new ModelMap();
		ResponseEntity<?> response;
		if (null != course) {
			map.put("Course Saved", courseService.saveCourse(course));
			response = new ResponseEntity<>(map, HttpStatus.OK);
		} else {
			map.put("Course not Saved", "OOPS something went wrong");
			response = new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return response;
	}
}
