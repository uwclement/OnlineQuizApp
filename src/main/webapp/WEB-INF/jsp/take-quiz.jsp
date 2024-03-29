<!-- src/main/webapp/WEB-INF/jsp/take-quiz.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Take Quiz</title>
</head>
<body>
<h1>${quiz.title}</h1>
<p>Duration: ${quiz.duration} minutes</p>
<form:form action="/quiz/${quiz.id}/submit" method="post" modelAttribute="answers">
    <c:forEach items="${quiz.questions}" var="question" varStatus="status">
        <h3>${status.index + 1}. ${question.text}</h3>
        <c:forEach items="${question.options}" var="option">
            <input type="radio" name="answers[${status.index}]" value="${option.id}"> ${option.text}<br>
        </c:forEach>
    </c:forEach>
    <input type="submit" value="Submit Quiz">
</form:form>
</body>
</html>