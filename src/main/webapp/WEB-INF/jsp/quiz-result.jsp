<!-- src/main/webapp/WEB-INF/jsp/quiz-result.jsp -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quiz Result</title>
</head>
<body>
<h1>Quiz Result</h1>
<p>Your score: ${userScore.score} out of ${userScore.quiz.questions.size()}</p>
<a href="/quizzes">Back to Quiz List</a>
</body>
</html>