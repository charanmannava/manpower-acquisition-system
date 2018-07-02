<%-- 
    Document   : ResultsAvailable
    Created on : 3 Sep, 2017, 5:01:38 PM
    Author     : SURYA PRIY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="h" %>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h1>Results available at present!</h1>
        <% try
        {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mapers","root","mysql123");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from result");
                while(rs.next())
                {
          %>  
    
        <p>
            <em><% out.println(rs.getString(1));%></em><br><br>
        </p>
    
       <% }
        }
        catch(Exception e)
        {
            out.println("Empty or error in processing");
        }
        %>
        </center>

    </body>
</html>
