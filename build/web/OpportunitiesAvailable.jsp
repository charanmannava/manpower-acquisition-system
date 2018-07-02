<%-- 
    Document   : OpportunitiesAvailable
    Created on : 3 Sep, 2017, 3:55:35 PM
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
        <h1>Opportunities available at present!</h1>
        <% try
        {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mapers","root","mysql123");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from opportunities");
                while(rs.next())
                {
          %>  
    
        <p>
            <em>Name of Company ::</em><% out.println(rs.getString(1));%><br><br>
            <em>Company ID ::</em><% out.println(rs.getString(2));%><br><br>
            <em>Company Type ::</em><% out.println(rs.getString(3));%><br><br>
            <em>Technology ::</em><% out.println(rs.getString(4));%><br><br>
            <em>Company Contact No ::</em><% out.println(rs.getString(5));%><br><br>
            <em>Package Offered::</em><% out.println(rs.getString(6));%><br><br>
            <em>Requirements ::</em><% out.println(rs.getString(7));%><br><br>            
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
