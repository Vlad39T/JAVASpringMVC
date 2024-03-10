<%--
  Created by IntelliJ IDEA.
  User: aavgu
  Date: 06.03.2024
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
 <form action="${pageContext.request.contextPath}/developer/form" method="post">
     <label>
         <input type="text" name="pib" placeholder="Введіть ПІБ">
     </label><br>
     <label>
         <input type="text" name="phone" placeholder="Введіть номер">
     </label><br>
     <label>
         <input type="text" name="email" placeholder="Введіть email">
     </label><br>
     <label>
         <input type="text" name="url" placeholder="Введіть посилання">
     </label><br>
     <label>
         <input type="text" name="notes" placeholder="Введіть примітки">
     </label><br>
     <c:if test="${developer == null}">
     <button type="submit">Add developer</button>
 </c:if>
     <c:if test="${developer != null}">
         <button type="submit">Update developer</button>
     </c:if>
 </form>
</body>
</html>
