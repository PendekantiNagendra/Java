<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <jsp:include page="Menu.html"></jsp:include> <br/><br/>
     <form method="get" action="SearchAccount.jsp">
       <center>
         Account No :
         <input type="text" name="accno" />
         <input type="submit" value="Search" />
       </center>
     </form>
</body>
</html>