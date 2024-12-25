package com.aadi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aadi.entity.Student;
import com.aadi.entity.StudentEntity;
import com.aadi.repo.StudentRepository;

@Service
public class StudentService {
	
	   @Autowired
	   StudentRepository studentRepository;
	
	
	     public void saveStudent(Student student)
	     
	     {
	    	 StudentEntity entity=new StudentEntity();
	    	 
	    	 entity.setTimings(Arrays.toString(student.getTimings()));
	    	 
	    	 BeanUtils.copyProperties(student, entity);
	    	 
	    	 
	    	 studentRepository.save(entity);
	    	 
	    	 System.out.println(entity);

	     }
	
	
	
	
	

	    public List<String> getCourses()
	    {
	    	return Arrays.asList("JAVA","Python","Data Science","Full Stack","Spring Boot");
	    			
	    }
	    
	    
	    public List<String> getTimings()
	    {
	    	return Arrays.asList("Morning","Afternoon","Evening");
	    }
	    
}
