package com.example.Placement_Portal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Placement_Portal.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> 
{
	public Student findByEmail(String email);

}
