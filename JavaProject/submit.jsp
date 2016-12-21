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
String Strusr="akhila";
String Strpas="akhila";


String email=request.getParameter("email");
System.out.println(email);
String password=request.getParameter("password");
System.out.println(password);

if((Strusr.equals(email))&&(Strpas.equals(password)))
{
	response.sendRedirect("homepage.jsp");
}
else if(!(email.equals(Strusr)))
{
	response.sendRedirect("username.jsp");
}
else
{
	response.sendRedirect("puerror.jsp");
}

	




%>

</body>
</html>