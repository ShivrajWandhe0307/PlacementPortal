package com.example.Placement_Portal.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Placement_Portal.Entity.Student;
import com.example.Placement_Portal.Repository.StudentRepository;

@Service
public class StudentServiceIMP implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean submitData(Student student) {
		try
		{
			studentRepository.save(student);
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Student loginEmail(String email, String password) {
		Student stud=studentRepository.findByEmail(email);
		if(stud!=null && stud.getPassword().equals(password))
		{
			return stud;
		}
		return null;
	}
	
	@Override
	public Student findByEmail(String email) {
	    return studentRepository.findByEmail(email);
	}

	
}
