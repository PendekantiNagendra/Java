<%@page import="com.hcl.cms.CollegeCrud"%>
<%@page import="com.hcl.cms.Feedback"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <form method="post" action="ConfirmFeedback.jsp">
      <%
        String instr =  (String)session.getAttribute("instr");
        String fid = (String)session.getAttribute("fid");
        String studentName = (String)session.getAttribute("studentName");
        String subject = request.getParameter("subject");
        String feed = request.getParameter("feed");
        %>
        Feedback Id :
        <input type="text" value="<%out.println(fid); %>" name="fid" /><br/><br/>
        <input type="text" value="<%out.println(instr); %>" name="instr" /><br/><br/>
       <input type="text" value="<%out.println(studentName); %>" name="studentName" /><br/><br/>
        <input type="text" value="<%out.println(subject); %>" name="subject" /><br/><br/>
        <input type="text" value="<%out.println(feed); %>" name="feed" /><br/><br/>
          <input type="submit" value="Confirm" />
      </form>
       <%
    if (request.getParameter("fid") != null &&
	  request.getParameter("studentName") != null &&
		  request.getParameter("instr") != null &&
				  request.getParameter("subject") != null &&
						  request.getParameter("feed") != null ) {
	  Feedback f = new Feedback();
	  f.setFid(request.getParameter("fid"));
	  f.setStudentName(request.getParameter("studentName"));
	  f.setInstructor(request.getParameter("instr"));
	  f.setSubject(request.getParameter("subject"));
	  f.setFbvalue (request.getParameter("feed"));
	  CollegeCrud crud = new CollegeCrud();
	  out.println(crud.addFeedback(f));
    }
    %>
</body>
</html>