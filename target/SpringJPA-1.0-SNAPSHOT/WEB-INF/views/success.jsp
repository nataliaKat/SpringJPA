<%-- 
    Document   : successdelete
    Created on : 7 Ιουλ 2019, 4:00:04 μμ
    Author     : kat26
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
		<link href="<c:url value='/static/style.css' />"  rel="stylesheet"></link>

        <script>
  setTimeout(function() {
      document.location = "/SpringJPA/trainers";
  }, 1000); 
</script>
    </head>
    <body>
        <h1>${action} successfull!</h1>
        
    </body>
</html>
