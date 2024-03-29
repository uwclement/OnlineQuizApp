<!-- src/main/webapp/WEB-INF/jsp/register.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
<h1>User Registration</h1>

<form:form action="/OnlineQuizApp/save" method="post" modelAttribute="user">
    <label for="username">Username:</label>
    <form:input path="username" id="username" />
    <br>
    <label for="email">Email:</label>
    <form:input path="email" id="email" />
    <br>
    <label for="password">Password:</label>
    <form:password path="password" id="password" />
    <br>
    <input type="submit" value="Register" />
</form:form>
</body>
</html>