<!-- src/main/webapp/WEB-INF/jsp/admin-quizzes.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Admin Quizzes</title>
</head>
<body>
<h1>Admin Quizzes</h1>
<a href="/admin/quiz/create">Create New Quiz</a>
<table>
    <thead>
    <tr>
        <th>Title</th>
        <th>Duration</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${quizzes}" var="quiz">
        <tr>
            <td>${quiz.title}</td>
            <td>${quiz.duration} minutes</td>
            <td>
                <a href="/admin/quiz/${quiz.id}/edit">Edit</a>
                <!-- Add delete functionality if needed -->
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>