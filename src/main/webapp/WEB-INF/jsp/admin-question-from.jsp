<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Question Form</title>
</head>
<body>
<h1>${questions.id == null ? 'Create Question' : 'Edit Question'}</h1>
<form:form action="${questions.id == null ? '/OnlineQuizApp/admin/question/create' : '/admin/question/' + questions.id + '/edit'}" method="post" modelAttribute="questions">
    <form:hidden path="id"/>
    <label for="text">Question Text:</label>
    <form:input path="text" id="text"/>
    <br>
    <label for="quiz">Quiz:</label>
    <select id="quiz" name="quiz.id">
        <c:forEach items="${quizList}" var="quiz">
            <option value="${quiz.id}">${quiz.title}</option>
        </c:forEach>
    </select>
    <br>
    <!-- Add form fields for options if needed -->
    <input type="submit" value="${questions.id == null ? 'Create' : 'Update'}">
</form:form>
</body>
</html>
