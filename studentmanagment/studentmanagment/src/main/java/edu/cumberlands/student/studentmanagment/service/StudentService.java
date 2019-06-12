package edu.cumberlands.student.studentmanagment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cumberlands.student.studentmanagment.model.Student;
import edu.cumberlands.student.studentmanagment.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Optional<Student> getStudent(Long studentId) {
		return studentRepository.findById(studentId);
	}
	
	public Student updateStudent(Student student) {
		//need to find if student is already excisted
	
		return studentRepository.save(student);
	}
	
	public void deleteStudent(Long studentId) {
		 studentRepository.deleteById(studentId);
	}
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}
	
	public List<Student> searchStudent(Student student){
		return studentRepository.searchStudent(student.getFirstName(), student.getLastName(), student.geteMail());
	}

}
