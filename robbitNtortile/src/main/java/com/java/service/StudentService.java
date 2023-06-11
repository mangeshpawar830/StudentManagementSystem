package com.java.service;

import java.util.List;

import com.java.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

	public List<Student> getByKeyword(String keyword);
}
