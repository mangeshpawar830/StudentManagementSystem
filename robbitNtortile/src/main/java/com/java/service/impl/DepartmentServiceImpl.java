package com.java.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.entity.Department;
import com.java.entity.Student;
import com.java.repository.StudentRepository;
import com.java.repository.departmentRepository;
import com.java.service.departmentService;

@Service
public class DepartmentServiceImpl implements departmentService{
	
	private departmentRepository depRepository;
	

	

	@Override
	public Department saveDepartment(Department department) {
		return depRepository.save(department);
	}

}
