<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page import="module.ReadJDBC" %>
<%@ page import="controller.Delete" %>
<%@ page import="common.User_Bean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students Information</title>
</head>
<body>
<center>
<h2> Students Information</h2>
<a href="UserRegistration.jsp">New User</a>

<%
ReadJDBC object_ReadJDBC=new ReadJDBC();
List<User_Bean> list=object_ReadJDBC.get_value();

Iterator<User_Bean> itr=list.iterator();

%>
<table border="1">
<%! int i=0; %>

<%
for (i=0;i<list.size();i++)
{
while(itr.hasNext())
{
	User_Bean object_User_Bean=new User_Bean();
	object_User_Bean=itr.next();
	i++;
%>
<tr>
<td><%= i %>
<%-- <td><%=object_User_Bean.getSl_no() %></td>--%>
<td><%=object_User_Bean.getName() %> </td>
<td><%=object_User_Bean.getPassword() %></td>
<td><%=object_User_Bean.getAddress() %></td>
<td><%=object_User_Bean.getCity() %></td>
<td><%=object_User_Bean.getEmail() %></td>
<td><%=object_User_Bean.getGender() %></td>
<td><%=object_User_Bean.getMobno1() %></td>
<td><%=object_User_Bean.getMobno2() %></td>
<td><%=object_User_Bean.getLanguage() %></td>
<td>
<a href="Edit.jsp?sl_no=<%=object_User_Bean.getSl_no()%>">Edit,</a>
&nbsp;
<a href="../Delete?sl_no=<%=object_User_Bean.getSl_no()%>">Delete</a>

</td>

</tr>


<%
}
}
%>

</table>

</center>

</body>
</html>