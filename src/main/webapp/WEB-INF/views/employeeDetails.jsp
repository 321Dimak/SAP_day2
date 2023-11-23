<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Details</title>
</head>
<body>
    <h2>Employee Details</h2>
    <c:if test="${foundEmployee ne null}">
        <p>Name: ${foundEmployee.name}</p>
        <p>Employee ID: ${foundEmployee.employeeId}</p>
        <p>Role: ${foundEmployee.role}</p>
        <p>Date of Joining: ${foundEmployee.dateOfJoining}</p>
    </c:if>
    <c:if test="${notFoundMessage ne null}">
        <p>${notFoundMessage}</p>
    </c:if>
    <a href="/">Back to Home</a>
</body>
</html>