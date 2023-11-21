<%--
  Created by IntelliJ IDEA.
  User: Prepress
  Date: 21.11.2023
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page 02: Who are you?</title>
</head>
<body>
<center>
    <%
        String message = (String)request.getAttribute("answer");
    %>
    <%= message %>

    <h1>Хто ви?</h1>
    <form action="/ufo02" method="post">

        <input type="radio" name="answer" value="true">Розповісти правду про себе<br>
        <input type="radio" name="answer" value="false">Збрехати про себе<br>
        <input type="submit" value="Ок">

    </form>
</center>

</body>
</html>
