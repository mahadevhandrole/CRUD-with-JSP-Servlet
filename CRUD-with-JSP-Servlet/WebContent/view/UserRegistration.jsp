<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students Details</title>
</head>

<body>
<center>
<h2> Student Registration</h2>
<form action="../Registration" method="post">
<table>
<tr>
<td>
Sl_no:</td>
<td>
<input type="text" name="sl_no1"/>
</td>
<tr>
 <td>Name :</td>
 <td>
    <input type="text" name="name1"/>
    </td>
    </tr>
    <tr>
    <td> Password:</td>
    <td>
    <input type="password" name="password1">
    </td>
    </tr>
    
    <tr>
    <td>Address:</td>
    <td>
    <textarea rows="5" cols="20" name="address1"></textarea>
    </td>
    </tr>
    
    <tr>
    <td>City:</td>
    <td>
    <select name="city1">
    <option>Pune</option>
    <option>Mumbai</option>
    <option>Bangalore</option>
    <option>Bidar</option>
    </select>
    </td>
    </tr>
    <tr>
    <td>Email:</td>
    <td>
    <input type="text" name="email1"/>
    </td>
    </tr>
    <tr>
    <td>Gender:</td>
    <td>
    <input type="radio" name="gender1" value="male"/>Male
    <input type="radio" name="gender1" value="female" />Female
    </td>
    </tr>
    
    <tr>
    <td>Mobile No:</td>
    <td>
    <input type="text" name="mobno3"/> <input type="text" name="mobno4"/>
    </td>
    </tr>
 
    <tr>
    <td> Languages:</td>
    <td>
     <input type="checkbox" name="lang1" value="hindi"/>Hindi
<input type="checkbox" name="lang1" value="english"/>English
<input type="checkbox" name="lang1" value="kannada"/>kannada
<input type="checkbox" name="lang1" value="marathi"/>Marathi
    </td>
    </tr>
    <tr>
    <td>
<input type="submit" value="Register" name="submit"/>    <input type="reset" value="reset" name="reset"/>   <a href="view/Home.jsp"><input type="button" value="cancel" name="cancel"/></a>
    </td>
    </tr>
</table>
</form>
</center>

</body>
</html>