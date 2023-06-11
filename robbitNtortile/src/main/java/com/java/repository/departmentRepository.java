package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.entity.Department;

public interface departmentRepository extends JpaRepository<Department, Long>{


}
