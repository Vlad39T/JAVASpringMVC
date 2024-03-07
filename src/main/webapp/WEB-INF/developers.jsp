<%--
  Created by IntelliJ IDEA.
  User: aavgu
  Date: 06.03.2024
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach var="developer" items="${dev}">
   <a href="/showDeveloper/${developer.phone}"><div>${developer.pib} </div></a>
</c:forEach> <br>

<a href="developer/form">Add developer</a>

</body>
</html>
