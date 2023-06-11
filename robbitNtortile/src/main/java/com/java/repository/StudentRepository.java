package com.java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.java.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	

	@Query(value = "select * from students s where s.first_name like %:keyword% or s.last_name like %:keyword% or s.email like %:keyword%", nativeQuery = true)

	List<Student> findByKeyword(@Param("keyword") String keyword);


	

}
