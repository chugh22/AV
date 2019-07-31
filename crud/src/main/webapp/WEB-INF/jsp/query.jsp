<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Student List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Address</th><th>Department</th></tr>  
   <tr>  
   <td>${stu.id}</td>  
   <td>${stu.name}</td>  
   <td>${stu.address}</td>  
   <td>${stu.department}</td>  
   </tr>  
   </table>  
   <br/>  
   