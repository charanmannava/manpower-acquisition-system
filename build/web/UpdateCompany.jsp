<%-- 
    Document   : UpdateCompany
    Created on : 2 Sep, 2017, 8:07:59 PM
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
        <h:form action="/updcomp">
        Company Name :<input type="text" name="compname" size="20" required/><br><br>
        Company Id :<input type="text" name="compid" size="20" required /><br><br>
        Company Type:<select name="comptype"> 
            <option value="Software">Software </option>
            <option value="Banking">Banking </option>
            <option value="Management">Management </option>
            <option value="Bussiness">Bussiness </option>
        </select>
        <br><br>
        EMAIL:<input type="email" name="emailid" size="20" required/><br><br>
        Contact :<input type="text" name="contact" size="20" required/><br><br>
        <input type="submit" value="SUBMIT"/><br><br>
        <input type="reset" value="RESET"/>            
        </h:form>
    </center>
    </body>
</html>
