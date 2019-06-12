package edu.cumberlands.course.coursemanagment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cumberlands.course.coursemanagment.model.Course;

import edu.cumberlands.course.coursemanagment.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}
	
	public Optional<Course> getCourse(Long courseId){
		return courseRepository.findById(courseId);
	}
	
	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}
	
	public void deleteCourse(Long courseId) {
		courseRepository.deleteById(courseId);
	}
	
	public List<Course> getAllCourses(){
		return courseRepository.findAll();
	}

}
