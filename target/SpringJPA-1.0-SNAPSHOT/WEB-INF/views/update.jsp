<%-- 
    Document   : update
    Created on : 7 Ιουλ 2019, 11:13:38 μμ
    Author     : kat26
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Trainer</title>
    </head>
    <body>
        <h1>Complete Fields</h1>
        <form method="POST" action="http://localhost:8080/SpringJPA/trainers/update">
            <input type="hidden" name="id" value="${trainer.trainerId}"/>
            Name: <input type="text" name="fname" value="${trainer.firstName}" width="35"/><br>
            Surname: <input type="text" name="lname" value="${trainer.lastName}" width="35"/><br>
            Subject: <input type="text" name="subject" value="${trainer.subject}" width="35"/><br>
            Date of Birth: <input type="date" name="dob" value="${trainer.dob}" width="35"/><br>
            Username: <input type="text"name="username" value="${trainer.username}" width="35"/><br>
            <p><input type="submit" value="Submit"/></p>
        </form>
    </body>
</html>
