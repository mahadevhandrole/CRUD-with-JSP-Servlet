<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="controller.Edit" %>
<%@ page import="common.User_Bean" %>
<%@ page import="module.EditJDBC" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<%
String sl_no=(String)request.getParameter("sl_no");
String name=request.getParameter("name");
String password=request.getParameter("password");
String address=request.getParameter("address");
String city=request.getParameter("city");
String email=request.getParameter("email");
String gender=request.getParameter("gender");

String mobno1=(String)request.getParameter("mobno1");
String mobno2=(String)request.getParameter("mobno2");
String language=request.getParameter("language");


EditJDBC object_edit=new EditJDBC();
User_Bean object_User_Bean=object_edit.get_value_of_user(sl_no,name,password,address,city,email,gender,mobno1,mobno2,language);

%>

<h1>Edit values</h1>
<form action="../Edit" method="post">
<table>
<tr>
<td>
Sl_no    :
</td>
<td><input type="text" name="sl_no1" value="<%= sl_no %>"> </td>
</tr>
<tr>
<td>
User Name:</td>
<td><input type="text" name="name1" value="<%=  object_User_Bean.getName()%>"></td>
</tr>
<tr>
<td>
Password :</td>
<td><input type="password" name="pwd1" value="<%= object_User_Bean.getPassword()%>"></td>
</tr>
<tr>
<td>
Address  :</td>
<td>
<textarea rows="5" cols="20" name="address1" textarea.Object="text" ><%= object_User_Bean.getAddress() %> </textarea>
</td>
</tr>
<tr>
<td>
City     :</td>
<td>
<% if("pune".equalsIgnoreCase(object_User_Bean.getCity())) {%>
<select name="city1">
     <option value="pune" selected>Pune</option>
    <option value="mumbai">Mumbai</option>
    <option value="bangalore">Bangalore</option>
    <option value="bidar">Bidar</option>
    </select>
    <% } else if("mumbai".equalsIgnoreCase(object_User_Bean.getCity())) {%>
    <select name="city1">
     <option value="pune">Pune</option>
    <option value="mumbai" selected>Mumbai</option>
    <option value="bangalore">Bangalore</option>
    <option value="bidar">Bidar</option>
    </select>
  <%} else if("bangalore".equalsIgnoreCase(object_User_Bean.getCity())) {%> 
  <select name="city1">
     <option value="pune">Pune</option>
    <option value="mumbai">Mumbai</option>
    <option value="bangalore" selected>Bangalore</option>
    <option value="bidar">Bidar</option>
    </select>
    <%} else if("bidar".equalsIgnoreCase(object_User_Bean.getCity())) {%> 
  <select name="city1">
     <option value="pune">Pune</option>
    <option value="mumbai">Mumbai</option>
    <option value="bangalore">Bangalore</option>
    <option value="bidar" selected>Bidar</option>
    </select>
    <% } else { %>
    <select name="city1">
     <option value="pune">Pune</option>
    <option value="mumbai">Mumbai</option>
    <option value="bangalore">Bangalore</option>
    <option value="bidar">Bidar</option>
    </select>
    <%} %>
    </td>
    </tr>
    
  <tr>
  <td>
Email    :</td>
<td><input type="text" name="email1" value="<%= object_User_Bean.getEmail() %>"></td>
</tr>
<tr>
<td>
Gender   :</td>
 <td>
 
 <% if("male".equalsIgnoreCase(object_User_Bean.getGender())) {%>
 <input type="radio" name="gender1" value="male" checked="checked"/>Male
    <% } else { %>
    <input type="radio" name="gender1" value="male"/>Male
   <% } %>
    <% if("female".equalsIgnoreCase(object_User_Bean.getGender())) {%>
 <input type="radio" name="gender1" value="female" checked="checked"/>Female
  <% } else { %>
  <input type="radio" name="gender1" value="female"/>Female
  <%} %>
 </td>
 </tr>
<tr>
    <td>Mobile No:</td>
    <td>
    <input type="text" name="mobno3" value="<%= object_User_Bean.getMobno1() %>"/> <input type="text" name="mobno4" value="<%= object_User_Bean.getMobno2() %>"/>
    </td>
    </tr>
 <tr>
    <td> Languages:</td>
     <td>
    <%
    String language1=object_User_Bean.getLanguage();
    String language2=language1.replace("[","");
    String language3=language2.replace("]","");
    List<String> list=new ArrayList<String>();

    if(language3!=null)
    {
    list=Arrays.asList(language3.split(", "));
    }
 // String[] s=new String[]{"hindi","english","kannada","marathi"};

 /*   for( String s:list)
    {
    	switch(s)
    	{
    	case "hindi":
    		h=s;
    		break;
    	case " english":
    		e=s;
    		break;
    	case " kannada":
    		k=s;
    		break;
    	case " marathi":
    		m=s;
    		break;
    		
    	}
    }*/
 
    %>
     <% if(list.contains("hindi")) {%>
     <input type="checkbox" name="lang1" value="hindi" checked="checked"/>Hindi
     <% } else { %>
     <input type="checkbox" name="lang1" value="hindi"/>Hindi
    <%} %> 
  
    <% if(list.contains("english")) { %>
     <input type="checkbox" name="lang1" value="english" checked="checked"/>English
     <% } else { %>
     <input type="checkbox" name="lang1" value="english"/>English
    <%} %>
    
    <% if(list.contains("kannada")) { %>
     <input type="checkbox" name="lang1" value="kannada" checked="checked"/>Kannada
     <% } else { %>
     <input type="checkbox" name="lang1" value="kannada"/>Kannada
    <%} %>
   
    <% if(list.contains("marathi")) { %>
     <input type="checkbox" name="lang1" value="marathi" checked="checked"/>Marathi
     <% } else { %>
     <input type="checkbox" name="lang1" value="marathi"/>Marathi
    <%} %>
</td>

    
    </tr>
<tr>
<td>
<input type="submit" value="Update"></td>
</tr>
</table>
</form>
</center>


</body>
</html>