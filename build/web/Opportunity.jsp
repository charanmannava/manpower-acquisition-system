<%-- 
    Document   : Opportunity
    Created on : 2 Sep, 2017, 1:01:15 PM
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
        <h:form action ="/oppo">
         Company Name :<input type="text" name="indname" size="20" required/><br><br>
         Company Id :<input type="text" name="indid" size="20" required /><br><br>
        Company type:<select name="indtype"> 
            <option value="Software">Software </option>
            <option value="Management">Management </option>
            <option value="Bussiness">Bussiness </option>
        </select>
        <br><br>
        Technology :<select name="tech" multiple="multiple" size="4">
            <option value="C">C</option>
            <option value="C++">C++</option>
            <option value="Java">Java</option>
            <option value="DBMS">DBMS</option>
            <option value="Struts">Struts</option>
        </select><br><br>
        REQUIREMENTS :<input type="text" name="req" size="20" required/><br><br>
        Contact :<input type="text" name="contact" size="20" required/><br><br>
        Minimum Package:<input type="text" name="packa" size="20" required/><br><br>        
        <input type="submit" value="SUBMIT"/><br><br>
        <input type="reset" value="RESET"/>
        </h:form>
        </center>

    </body>
</html>
