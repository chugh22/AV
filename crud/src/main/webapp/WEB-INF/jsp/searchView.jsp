<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
        <h1>Search</h1>  
       <form action="search">    
        <table > 
        <tr>    
          <td>Name : </td>   
          <td><input type="text" name ="name"  /></td>  
         </tr>       
         <tr>     
          <td><input type="submit" value="Search" /></td>    
         </tr>    
        </table>    
       </form>    