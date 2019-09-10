<%@page import="com.hcl.ems.Employ"%>
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
   
   out.println("My Account Details");
   String user = (String)session.getAttribute("emp_Id");
   int empId = Integer.parseInt(user);
   out.println("empId");
   Employ emp = EmsBal.MyAccountBal(empId);
   out.println("<table>");
   out.println("<tr><th>Employ Id</th><td>"+emp.getEmpId()+"</td></tr>");
   out.println("<tr><th>Employ Name</th><td>"+emp.getEmpName()+"</td></tr>");
   out.println("<tr><th>Employ Email</th><td>"+emp.getEmpEmail()+"</td></tr>");
   out.println("<tr><th>Employ Dept</th><td>"+emp.getEmpDeptName()+"</td></tr>");
   out.println("<tr><th>Join Date</th><td>"+emp.getEmpDateJoined()+"</td></tr>");
   out.println("<tr><th>Mobile No</th><td>"+emp.getEmpMobNo()+"</td></tr>");
   out.println("<tr><th>Leave Balance</th><td>"+emp.getEmpLeaveBal()+"</td></tr>");
   out.println("</table>");

   %>
</body>
</html>