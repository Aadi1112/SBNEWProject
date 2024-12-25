<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <p> <font color='green'>${msg}</font> </p>
   
   <h2>Product Form </h2>
   <hr>

	<form:form action="product" modelAttribute="product" method="post">


         <table>
         
             <tr>
             
             <td>ProductName : </td>
             <td><form:input path="name"/>  </td>
             
             </tr>
             
             
              <tr>
             
             <td>ProductPrice : </td>
             <td><form:input path="price"/>  </td>
             
             </tr>
             
             
             <tr>
             
             <td>ProductQuantity : </td>
             <td><form:input path="qty"/>  </td>
             
             </tr>
             
             
             <tr>
             
             
             <td> <input type="submit" value="Save">  </td>
             
             </tr>
         
         
             
         
         
         
         
         </table>
         
         <a href="products">View All Products</a>



	</form:form>


</body>
</html>