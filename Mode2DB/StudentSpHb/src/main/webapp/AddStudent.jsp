<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <form method="get" action="/addStudent" >
        Roll No :
        <input type="text" name="rollNo" /> <br/><br/>
         Student Name :
        <input type="text" name="sName" /> <br/><br/>      
        Age :
        <input type="text" name="age" /> <br/><br/>
         Gender :
        <input type="radio" name="gender" value="Male"/>
        <input type="radio" name="gender" value="Female"/> <br/><br/>
        Country :
       <select>
         <option value="India">India</option>
          <option value="US">US</option>
           <option value="Canada">Canada</option>
            <option value="Europe">Europe</option>
             <option value="Australia">Australia</option>
       </select> <br/><br/>
       Date of Join :
       <input type="date" name="dateOfJoin" /><br/><br/>
       Final Score :
       <input type="text" name="finalScore" /><br/><br/>
       <input type="submit" value="Add" />
      </form>
</body>
</html>