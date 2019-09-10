<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.bank.DaoConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <form method="get" action="Login.jsp">
       <center>
         User Name :
         <input type="text" name="userName" /> <br/><br/>
         Password :
         <input type="password" name="password" /> <br/><br/>
         <input type="submit" value="Login" />
       </center>
     </form> 
     <%
     if (request.getParameter("userName") != null &&
    		 request.getParameter("userName") != null) {
    	 String user = request.getParameter("userName");
    	 String pwd = request.getParameter("password");
    	 if ( user.equals("Nagendra") && pwd.equals("Yadav")) {
    		 %>
    		 <jsp:forward page= "Menu.html" />
    		 <%
    	 } else {
    		 out.println("***Invalid Credentials***");
    	 }

     }
     %>
</body>
</html>