<%@page import="com.hcl.cms.CollegeCrud"%>
<%@page import="com.hcl.cms.Subjects"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form method="get" action="AddSubjects.jsp" name="productForm" >
     
        <select name="subject" id="dropdown" onchange="change()">
           <option value="dropdown">Select one Sub</option>
           <option value="C/C++">C/C++</option>
           <option value="Java">Java</option>
           <option value="DBMS">DBMS</option>
           <option value="Servlet">Servlet</option>
           <option value="Spring">Spring</option>
        </select> <br/><br/>
        Theory     :
        <input type="text" name="theory" id="theory" readonly="readonly" /> <br/><br/>
        Practical  :
        <input type="text" name="practical" id="practical" readonly="readonly" /> <br/><br/>
        Year  :
        <input type="text" name="year" /> <br/><br/>
        Instructor :
        <input type="text" name="instructor" /> <br/><br/>
        <input type="submit" value="Add"> <br/><br/>
     </form>
    <script>  
       function change() {
    	   var pd = document.getElementById("dropdown").value;
    	   if (pd=="C/C++") {
    		   productForm.theory.value="42";
           	productForm.practical.value="14";
    	   }
    	   
    	   if (pd=="Java") {
    		   productForm.theory.value="85";
           	productForm.practical.value="20";
    	   }
    	   
    	   if (pd=="DBMS") {
    		   productForm.theory.value="60";
           	productForm.practical.value="19";
    	   }
    	   
    	   if (pd=="Servlet") {
    		   productForm.theory.value="70";
           	productForm.practical.value="15";
    	   }
    	   
    	   if (pd=="Spring") {
    		   productForm.theory.value="52";
           	productForm.practical.value="12";
    	   }
       }
    </script>
    <%
    if (request.getParameter("subject") != null &&
	  request.getParameter("theory") != null &&
		  request.getParameter("practical") != null &&
				  request.getParameter("year") != null &&
						  request.getParameter("instructor") != null ) {
	  Subjects s = new Subjects();
	  s.setSubject(request.getParameter("subject"));
	  s.setTheory(Integer.parseInt(request.getParameter("theory")));
	  s.setPractical(Integer.parseInt(request.getParameter("practical")));
	  s.setYear(Integer.parseInt(request.getParameter("year")));
	  s.setInstructor(request.getParameter("instructor"));
	  CollegeCrud crud = new CollegeCrud();
	  out.println(crud.addSubjects(s));
}
    %>
</body>
</html>