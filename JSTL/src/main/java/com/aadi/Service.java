package com.aadi;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/names")
public class Service  extends HttpServlet{


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Ram");
		s1.setMarks(98.34);
		
		
		Student s2=new Student();
		s2.setId(2);
		s2.setName("Aakash");
		s2.setMarks(99.34);
		
		Student s3=new Student();
		s3.setId(3);
		s3.setName("Navnath");
		s3.setMarks(100.34);
		
		
		List<Student> students= Arrays.asList(s1,s2,s3);
		
		req.setAttribute("students", students);
		
		
		req.getRequestDispatcher("names.jsp").forward(req, resp);
	}
	
	
	
}
