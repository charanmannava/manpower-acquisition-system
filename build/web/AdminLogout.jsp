<%-- 
    Document   : AdminLogout
    Created on : 3 Sep, 2017, 5:58:37 AM
    Author     : SURYA PRIY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% if(session.getAttribute("admin")!=null)
        {
            session.invalidate();
        }
        %>
    <center>
        <h1>You have successfully Logged out</h1>
    </center>
    </body>
</html>
