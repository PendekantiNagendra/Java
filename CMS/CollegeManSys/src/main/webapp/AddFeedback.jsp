<%@page import="com.hcl.cms.HibernateUtil"%>
<%@page import="com.hcl.cms.CollegeCrud"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <%String res=CollegeCrud.FeedbackId();%>
    <% List<String>lstSubjects=CollegeCrud.showInstructor(); %>
     <form method="get" name="frmFeedback" action="AddFeedback.jsp">
     <center>
     Feedback ID :
     <input type="text" name="fid" value=<%=res %> /> <br/><br/>
     Student Name :
     <input type="text" name="studentName" /> <br/><br/>
     Instructor :
		<select name="instructor" onchange="change()">
			<option value="please select" >please select</option>
			<% 
			 for(String ins :lstSubjects){
			out.println("<option value=" + ins +">" + ins +"</option>");
			 }
			%>
		</select> <br/><br/>
		<%
		String instr=request.getParameter("instructor");
		out.println(instr);
		session.setAttribute("instr", instr);
		String fid=request.getParameter("fid");
		out.println(fid);
		session.setAttribute("fid", fid);
		String studentName=request.getParameter("studentName");
		out.println(studentName);
		session.setAttribute("studentName", studentName);
		%>
		</form>
		<script>
		        function change(){
		           document.frmFeedback.submit();
		        }
	    </script>
		<form method="get" action="ConfirmFeedback.jsp">
 			Select Subject :
	 		<select name="subject">
				 <%
				 List<String>lst1=CollegeCrud.showSubject(instr);
				 for(String obj1 : lst1){
				%>
				<option><%=obj1 %></option>
				<%}%>
			</select> <br/><br/>
	    <p>Please give your Feedback :</p> <br/>
	       Feed:
	        <input type="radio" name="feed" value="excellent">Excellent</input> &nbsp;&nbsp;
	        <input type="radio" name="feed" value="good" >Good</input> &nbsp;&nbsp;
	        <input type="radio" name="feed" value="adequate" >Adequate</input> &nbsp;&nbsp;
	        <input type="radio" name="feed" value="inAdequate" >InAdequate</input>  &nbsp;&nbsp;
	        <input type="submit" value="Show" /> <br/><br/>
	</form>
			
	
    
</body>
</html>