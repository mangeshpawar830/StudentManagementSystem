package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.entity.Department;
import com.java.entity.Student;
import com.java.service.departmentService;

@Controller
public class departmentController {
	
	@GetMapping("/department/new")
	public String createDepartmentForm(Model model) {
		Department department = new Department();
		model.addAttribute("department", department);
		return "create_department";
		
	}
	
	
	

}
