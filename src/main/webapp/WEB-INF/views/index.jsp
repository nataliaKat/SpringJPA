<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        		<link href="<c:url value='/static/style.css' />"  rel="stylesheet"></link>

        <script>
  setTimeout(function() {
      document.location = "/SpringJPA/trainers";
  }, 1000); 
</script>
    </head>

    <body>
        <h1>Welcome to trainers' web application</h1>
    </body>
</html>
