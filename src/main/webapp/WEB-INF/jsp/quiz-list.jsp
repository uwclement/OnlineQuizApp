<!-- src/main/webapp/WEB-INF/jsp/quiz-list.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Quiz List</title>
</head>
<body>
<h1>Welcome, ${user.username}!</h1>
<h2>Available Quizzes</h2>
<ul>
    <c:forEach items="${quizzes}" var="quiz">
        <li>
            <a href="/quiz/${quiz.id}">${quiz.title}</a> (Duration: ${quiz.duration} minutes)
        </li>
    </c:forEach>
</ul>
</body>
</html>