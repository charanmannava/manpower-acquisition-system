<%-- 
    Document   : IndividulalInformation.jsp
    Created on : 5 Sep, 2017, 8:04:09 PM
    Author     : SURYA PRIY
--%>

<%@page import="java.io.InputStream"%>
<%@page import="java.sql.Blob"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <center>
       <% if(session.getAttribute("indid")!=null)
          {
            %>         
        <h1>Company's Information</h1>
        <p>
            <em>Name  ::</em><% out.println(" "+session.getAttribute("compname"));%><br><br>
            <em>User ID ::</em><% out.println(" "+session.getAttribute("compide"));%><br><br>
            <em> Type ::</em><% out.println(" "+session.getAttribute("comptype"));%><br><br>
            <em> Email ::</em><% out.println(" "+session.getAttribute("compemail"));%><br><br>
            <em> Contact No ::</em><% out.println(" "+session.getAttribute("compcont"));%><br><br>
            <em> Minimum Package ::</em><% out.println(" "+session.getAttribute("indpack"));%><br><br>
       <%    Blob imageBlob = (Blob)session.getAttribute("indres");
             InputStream bin = imageBlob.getBinaryStream(0, imageBlob.length());     
         %>    
            <em> Resume ::</em><% out.println(" "+session.getAttribute("indres"));%><br><br>
        </p>
    </center>
        <% }
          else
       {
           out.println("<h2><font color=red> You must login first </font></h2>");
       %>
       <jsp:include page="/IndividualLogin.jsp" />
       <% } %>
        
    </body>
</html>
