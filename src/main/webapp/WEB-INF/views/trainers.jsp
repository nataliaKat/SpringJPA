<%-- 
    Document   : trainers
    Created on : 5 Ιουλ 2019, 11:26:09 πμ
    Author     : kat26
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trainers Page</title>

   

        <!--href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">-->
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
        <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>   
        <script type="text/javascript">
            $(document).ready(function () {
                $('#trainers').DataTable();
            });
        </script>


    </head>
    <body>
        <table border="1" id="trainers">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Subject</th>
                    <th>Date of Birth</th>
                    <th>Username</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${trainers}" var="trainer">
                    <tr>
                        <td>${trainer.trainerId}</td>
                        <td>${trainer.firstName}</td>
                        <td>${trainer.lastName}</td>
                        <td>${trainer.subject}</td>
                        <td>${trainer.dob}</td>
                        <td>${trainer.username}</td>

                        <td><a href="<c:url value='trainers/update/${trainer.trainerId}'/>">Update</a> / 
                            <a href="<c:url value='trainers/delete/${trainer.trainerId}'/>"> Delete</a>
                        </td>

                    </tr>
                </c:forEach>
            </tbody>
        </table>  

        <a href="<c:url value='/trainers/insert'/>">Insert new trainer</a>


    </body>
    <!--    <script src="https://code.jquery.com/jquery-3.4.1.min.js"
        integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>-->
</html>
