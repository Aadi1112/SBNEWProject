package com.aadi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aadi.entity.Student;
import com.aadi.service.StudentService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	  StudentService service;
	
	  @GetMapping("/")
	  public String loadForm(Model model)
	  {
		  Student student=new Student();
		 
		  model.addAttribute("student", student);
		  model.addAttribute("courses", service.getCourses());
		  model.addAttribute("timings", service.getTimings());
		  return "index";
	  }
	  
	  @PostMapping("/save")
	  public String saveStudent( Student s,Model model)
	  {
		   
		  service.saveStudent(s);
		  Student student=new Student();
		  model.addAttribute("student", student);
		  model.addAttribute("courses", service.getCourses());
		  model.addAttribute("timings", service.getTimings());
		  
		  model.addAttribute("msg", "Data Saved");
		  return "index";
	  }
	  
	  
	  
	  
}
