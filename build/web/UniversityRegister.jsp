<%-- 
    Document   : UniversityRegister
    Created on : 2 Sep, 2017, 2:49:35 AM
    Author     : SURYA PRIY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="h"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h:form action ="/univereg">
        University Name :<input type="text" name="univname" size="20" required/><br><br>
        University Id :<input type="text" name="univid" size="20" required /><br><br>
        University Type:<select name="univtype"> 
            <option value="Software">Software </option>
            <option value="Management">Management </option>
            <option value="Bussiness">Bussiness </option>
        </select>
        <br><br>
        Students :<input type="text" name="student" size="20" required/><br><br>
        Minimum Package:<input type="text" name="packa" size="20" required/><br><br>
        EMAIL:<input type="email" name="emailid" size="20" required/><br><br>
        Contact :<input type="text" name="contact" size="20" required/><br><br>
        <input type="submit" value="SUBMIT"/><br><br>
        <input type="reset" value="RESET"/>
        </h:form>
        </center>
       
    </body>
</html>
