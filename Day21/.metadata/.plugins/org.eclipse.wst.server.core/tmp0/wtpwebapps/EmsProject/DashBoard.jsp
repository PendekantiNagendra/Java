<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     Welcome to <%=(String)session.getAttribute("emp_Id") %>
     <div id="mainSec">
     
        <div id="myProfile">
           <jsp:include page="MyAccount.jsp" />
        </div>
        
        <div id="mngrProfile">
           <jsp:include page="ManagerAccount.jsp" />
        </div>
     </div>
</body>
</html>