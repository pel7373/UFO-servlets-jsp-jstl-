<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lose Page</title>
</head>
<body>

<center>
<%
    String message = (String)request.getAttribute("answer");
%>
<%= message %>
<h1>Ви програли!</h1>
<form action="/" method="post">
    <input type="submit" value="Почати гру заново!">
</form>
</center>

</body>
</html>