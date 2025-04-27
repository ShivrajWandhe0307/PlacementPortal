package com.example.Placement_Portal.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Placement_Portal.Entity.Student;

public interface StudentService
{
	
	public boolean submitData(Student student);
	
	public Student loginEmail(String email,String password);
	Student findByEmail(String email);
	
	
}
