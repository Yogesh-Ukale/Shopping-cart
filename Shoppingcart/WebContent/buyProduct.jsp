<%@page import="Dao.*,bean.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 session=request.getSession(true);
if(session.getAttribute("user")!=null) 
{
	//if(session.getAttribute("upass")!=null)
	//{
			SingUp ob=(SingUp)session.getAttribute("user");
			out.print(ob.getAdd());
		buyProductDao obj=new buyProductDao();
		String str=obj.getdata();
	
		out.print("<h2>Delevery Address:</h2>");	
		out.print("<table><tr><td>Name</td><td>Mobaile No</td><td>Address</td></tr></table>");
		out.println(str);
		
		out.println("<h1>Price Detail:</h1>");
		out.println("<h3>Delevery Charge:  free</h3>");
		out.println("<h3>Payable Amount: Rs-669</h3");
		//out.println("Payment");
		
		
		//SingUp ob=(SingUp)session.getAttribute("user");
		
		
		out.println(ob.getFname());
		out.println("<br>");
		out.println(ob.getAdd());
		out.println("<br>");
		out.println(ob.getMoNo());
		out.println("<br>");
		
		out.println("success....");
	
	//}
}
else
{
	response.sendRedirect("Login.html");
}

//Object sss = session.getAttribute("uname");
%>

//<%= request.getAttribute("uname") %>

<form action="payment.jsp" method=Post>
<input type=submit value="Payment option.">
</form>
</body>
</html>