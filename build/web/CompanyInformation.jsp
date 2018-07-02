<%-- 
    Document   : CompanyInformation
    Created on : 2 Sep, 2017, 8:34:13 PM
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
       <% if(session.getAttribute("companyid")!=null)
          {
            %>         
        <h1>Company's Information</h1>
        <p>
            <em>Name of Company ::</em><% out.println(" "+session.getAttribute("compname"));%><br><br>
            <em>Company ID ::</em><% out.println(" "+session.getAttribute("compide"));%><br><br>
            <em>Company Type ::</em><% out.println(" "+session.getAttribute("comptype"));%><br><br>
            <em>Company Email ::</em><% out.println(" "+session.getAttribute("compemail"));%><br><br>
            <em>Company Contact No ::</em><% out.println(" "+session.getAttribute("compcont"));%><br><br>
        </p>
    </center>
        <% }
          else
       {
           out.println("<h2><font color=red> You must login first </font></h2>");
       %>
       <jsp:include page="/CompanyLogin.jsp" />
       <% } %>
       
    </body>
</html>
