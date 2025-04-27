package com.example.Placement_Portal.StudentDTO;

public class StudentDTO 
{
	
	private int id;
	private String firstName;
	private String lastName;
	
	private String email;
    private String mobile;
    private String branch;
    private String gender;

    private Double marks10;
    private Double marks12;
    private Double gradMarks;

    private String imagePath;    // For uploaded image filename/path
    private String resumePath;   // For uploaded resume filename/path
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getMarks10() {
		return marks10;
	}
	public void setMarks10(Double marks10) {
		this.marks10 = marks10;
	}
	public Double getMarks12() {
		return marks12;
	}
	public void setMarks12(Double marks12) {
		this.marks12 = marks12;
	}
	public Double getGradMarks() {
		return gradMarks;
	}
	public void setGradMarks(Double gradMarks) {
		this.gradMarks = gradMarks;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getResumePath() {
		return resumePath;
	}
	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}
	public StudentDTO(int id, String firstName, String lastName, String email, String mobile, String branch,
			String gender, Double marks10, Double marks12, Double gradMarks, String imagePath, String resumePath) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.branch = branch;
		this.gender = gender;
		this.marks10 = marks10;
		this.marks12 = marks12;
		this.gradMarks = gradMarks;
		this.imagePath = imagePath;
		this.resumePath = resumePath;
	}
    
    
    public StudentDTO()
    {
    	
    }


}
