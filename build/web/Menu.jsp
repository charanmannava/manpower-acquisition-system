<%-- 
    Document   : Menu
    Created on : 1 Sep, 2017, 11:34:50 PM
    Author     : SURYA PRIY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="h" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h:link action="/reg">REGISTER</h:link><br><br>
        <h:link action="/int">INTERVIEW</h:link><br><br>
        <h:link action="/adlog">ADMIN LOGIN</h:link><br><br>
        <h:link action="/unilog">UNIVERSITY LOGIN</h:link><br><br>
        <h:link action="/comlog">COMPANY LOGIN</h:link><br><br>
        <h:link action="/indlog">INDIVIDUAL LOGIN</h:link><br><br>
    </center>
    </body>
</html>
