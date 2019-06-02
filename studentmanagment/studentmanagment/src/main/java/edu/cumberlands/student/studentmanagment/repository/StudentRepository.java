package edu.cumberlands.student.studentmanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cumberlands.student.studentmanagment.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
