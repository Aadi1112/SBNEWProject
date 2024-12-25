package com.aadi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddStudent extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String marks = req.getParameter("marks");

	
		
		Student student = new Student();
		student.setId(Integer.parseInt(id));
		student.setName(name);
		student.setMarks(Double.parseDouble(marks));

		
		HttpSession ss= req.getSession();
		
		List<Student> list=(List<Student>) req.getAttribute("students");
		if(list==null) {
			
			list=new ArrayList<Student>();
		}
		
		list.add(student);
		ss.setAttribute("students", list);
		System.out.println(list);
		
		req.getRequestDispatcher("names.jsp").forward(req, resp);

	}
}
