<!-- src/main/webapp/WEB-INF/jsp/login.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>User Login</title>
</head>
<body>
<h1>User Login</h1>
<form:form action="/OnlineQuizApp/login" method="post" modelAttribute="user">
    <label for="email">Email:</label>
    <form:input path="email"  name="email" id="email" />
    <br>
    <label for="password">Password:</label>
    <form:password path="password" name="password" id="password" />
    <br>
    <input type="submit" value="Login" />
</form:form>
</body>
</html>
