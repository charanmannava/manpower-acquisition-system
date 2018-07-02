<%-- 
    Document   : HomAdmin
    Created on : 3 Sep, 2017, 5:10:36 AM
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
    <center>
        <% if(session.getAttribute("admin")!=null)
        {
        %>    
        <h2> Details of All !!</h2>
        <em>Number of Companies ::</em><% out.println(" "+session.getAttribute("councomp")); %><br><br>
        <em>Number of Universities ::</em><% out.println(" "+session.getAttribute("coununiv")); %><br><br>
        <% } 
         else
        {
            out.println("<h3><font color=red>You must Login first as Admin!!</font color></h3>");
        %>
        <jsp:include page="/AdminLogin.jsp" />
        <% } %>
    </center>
    </body>
</html>
