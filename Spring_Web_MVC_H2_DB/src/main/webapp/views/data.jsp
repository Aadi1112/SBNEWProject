<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <a href="/">+Add New Product</a>

      <table border="2">
      
         <thead>
         
           <tr>
             <th>Sr.No</th>
             <th>Name</th>
             <th>Price</th>
             <th>Quantity</th>
           </tr>
         
         </thead>
         
         
         <tbody>
         
         
         <c:forEach items="${products}" var="product" varStatus="index">
              
               <tr>
               
                 <td>${index.count}</td>
                 <td>${product.name}</td>
                 <td>${product.price}</td>
                 <td>${product.qty}</td>
               
               
               </tr>
           
         
         
         
         </c:forEach>
         
         
         
         
         
         
         
         </tbody>
      
      </table>
      
      
</body>
</html>