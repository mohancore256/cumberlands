package edu.cumberlands.course.coursemanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cumberlands.course.coursemanagment.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
