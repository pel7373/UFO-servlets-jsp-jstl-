<%--
  Created by IntelliJ IDEA.
  User: Prepress
  Date: 21.11.2023
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page 01: climb to the captain's bridge</title>
</head>
<body>
<center>
    <%
        String message = (String)request.getAttribute("answer");
    %>
    <%= message %>

    <h1>Піднятися на капітанський місток?</h1>
    <form action="/ufo01" method="post">

        <input type="radio" name="answer" value="true">Так<br>
        <input type="radio" name="answer" value="false">Ні<br>
        <input type="submit" value="Ок">

    </form>
</center>
</body>
</html>
