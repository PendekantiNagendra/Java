<%@page import="com.hcl.ems.EmsBal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
     int empId = Integer.parseInt(request.getParameter("empId"));
     String secretCode = request.getParameter("secretCode");
     boolean status = EmsBal.LoginBal(empId, secretCode);
     
     if (status) {
    	 String uid="";
    	 uid += empId;
    	 session.setAttribute("empId", uid);
    	 %>
     <jsp:forward page="DashBoard.jsp" />
     <%
     } else {
    %>		 
    <jsp:include page="Login.html"></jsp:include>
    <%
     out.println("Invalid Credentials..");
     }
    %>
</body>
</html>