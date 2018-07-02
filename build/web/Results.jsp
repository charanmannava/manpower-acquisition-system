<%-- 
    Document   : Results
    Created on : 2 Sep, 2017, 1:01:30 PM
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
        <h3>ADD RESULT</h3>
        <h:form action="/resultslog">
            <textarea name="res" rows="20" cols="50">
            </textarea><br><br>
            <input type="submit" value="SUBMIT" />
        </h:form>
    </center>

    </body>
</html>
