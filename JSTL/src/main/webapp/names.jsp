<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<h2 class="text-center bg-info">Student Details</h2>
 <a href="addstudent.jsp" class="btn btn-success mt-2 mb-2">Add Student</a>


<table class="table table-striped table-bordered ">

  <thead class="text-center table-dark">
  
  <tr>
  <th>ID</th>
  <th>Name</th>
  <th>Marks</th>
  </tr>
  
  </thead>
  <tbody>
  
  <c:forEach var="student" items="${students}">
   <tr class="text-center">
   
    <td>${student.getId()}</td>
     <td>${student.getName()}</td>
      <td>${student.getMarks()}</td>
   
   </tr>
  
  </c:forEach>
  
  
  </tbody>
 
 
 
 </table>
 
</body>
</html>