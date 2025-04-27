package com.example.Placement_Portal.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student_Id")
    private int studId;
    
    @Column(name = "Student_Name")
    private String studName;

    @Column(name = "Student_Email",unique = true)
    private String email;
    
    
    @Column(name = "Password")
    private String password;


    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

  


    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Student(int studId, String studName, String email, String password) {
        this.studId = studId;
        this.studName = studName;
        this.email = email;
        this.password=password;
       
    }

    public Student()
    {

    }
}
