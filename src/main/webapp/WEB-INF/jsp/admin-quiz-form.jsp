<!-- src/main/webapp/WEB-INF/jsp/admin-quiz-form.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Quiz Form</title>
</head>
<body>
<h1>${quiz.id == null ? 'Create Quiz' : 'Edit Quiz'}</h1>
<form:form action="${quiz.id == null ? '/OnlineQuizApp/admin/quiz/create' : '/admin/quiz/' += quiz.id += '/edit'}" method="post" modelAttribute="quiz">
    <form:hidden path="id"/>
    <label for="title">Title:</label>
    <form:input path="title" id="title"/>
    <br>
    <label for="duration">Duration (in minutes):</label>
    <form:input path="duration" id="duration" type="number"/>
    <br>
    <!-- Add form fields for questions and options if needed -->
    <input type="submit" value="${quiz.id == null ? 'Create' : 'Update'}">
</form:form>
</body>
</html>