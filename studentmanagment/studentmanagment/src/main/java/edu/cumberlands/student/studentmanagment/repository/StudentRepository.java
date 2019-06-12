package edu.cumberlands.student.studentmanagment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.cumberlands.student.studentmanagment.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	@Query( nativeQuery = true, value="select * from student where first_name regexp ?1 OR last_name regexp ?2 OR e_mail regexp ?3")
	public List<Student> searchStudent(String firstName, String lastName, String eMail);
	


}
