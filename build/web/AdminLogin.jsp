<%-- 
    Document   : AdminLogin
    Created on : 2 Sep, 2017, 1:12:02 PM
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
        <h:form action="/adminlog">
            Enter Password ::<input type="password" name="apass" size="20" required /><br><br>
            <input type="submit" value="LOGIN" />
        </h:form>
    </center>
    </body>
</html>
