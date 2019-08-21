<%-- 
    Document   : insert
    Created on : 30 Ιουν 2019, 7:08:02 μμ
    Author     : kat26
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert</title>
     

    </head>
    <body>
        <h1>Complete Fields</h1>
        <form method="POST" action="insert">
            Name: <input type="text" name="fname" required= width="35"/><br>
            Surname: <input type="text" name="lname" required width="35"/><br>
            Subject: <input type="text" name="subject" required width="35"/><br>
            Date of Birth: <input type="date" name="dob" required width="35"/><br>
            <p><input type="submit" value="Submit"/></p>
        </form>
            
    </body>
</html>
