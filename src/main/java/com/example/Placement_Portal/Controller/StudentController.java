package com.example.Placement_Portal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.Placement_Portal.Entity.Student;
import com.example.Placement_Portal.Repository.StudentRepository;
import com.example.Placement_Portal.Service.StudentService;
import com.example.Placement_Portal.StudentDTO.StudentDTO;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/Profound")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/")
	public String registerUser() {
		return "Profile";
	}

	@GetMapping("/register")
	public String newUser(Model model) {
		model.addAttribute("student", new Student());
		return "Register";
	}

	@PostMapping("/SubmitData")
	public String submitData(@ModelAttribute("student") Student student, RedirectAttributes redirectAttributes) {

	    // Step 1: Validate password length
	    if (student.getPassword().length() < 7) {
	        redirectAttributes.addFlashAttribute("errorMsg", "Password must be at least 7 characters.");
	        return "redirect:/Profound/register";
	    }

	    // Step 2: Check if email already exists
	    Student existing = studentService.findByEmail(student.getEmail());
	    if (existing != null) {
	        redirectAttributes.addFlashAttribute("errorMsg", "Email is already registered.");
	        return "redirect:/Profound/register";
	    }

	    // Step 3: Save user
	    boolean status = studentService.submitData(student);
	    if (status) {
	        redirectAttributes.addFlashAttribute("successMsg", "User registered successfully!");
	    } else {
	        redirectAttributes.addFlashAttribute("errorMsg", "Registration failed. Please try again.");
	    }

	    return "redirect:/Profound/register";
	}


	@GetMapping("/login")
	public String openLogin(Model model) {
		model.addAttribute("student", new Student());
		return "Login";
	}

	@PostMapping("/LoginForm")
	public String checkData(@ModelAttribute("student") Student student, RedirectAttributes redirectAttributes ,Model model) {
		Student stud = studentService.loginEmail(student.getEmail(), student.getPassword());
		if (stud != null) {
			model.addAttribute("studName", student.getStudName());
			return "indexCopy";
		} else {
			redirectAttributes.addFlashAttribute("errorMsg", "Check Email and Password..!");
			return "redirect:/Profound/login";
		}
	}
	
	@GetMapping("/home")
	public String homePage()
	{
		return "indexCopy";
	}
	
	
	@GetMapping("/StudentProfile")
	public String StudetProfile(Model model)
	{
		model.addAttribute("studentDTO", new StudentDTO());
		return "StudentData";
	}
	
	
	
	@GetMapping("/application")
	public String shwoJobs()
	{
		return "JobApplication";
	}

	

}
