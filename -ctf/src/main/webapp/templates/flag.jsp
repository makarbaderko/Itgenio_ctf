<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Flag</title>
</head>

<body>
<div>
    <form method="POST" action="/flag">
        <h2>Вход в систему</h2>
        <div>
            <input name="flagKey" type="text" placeholder="flagKey"/>
            <button type="submit">Log In</button>
            <h4><a href="/registration">Зарегистрироваться</a></h4>
        </div>
    </form>
</div>
<table>
    <thead>
  <th>Html</th>
    </thead>
    <c:forEach items="${allFlags}" var="flag">
        <tr>
            <td>${flag.text}</td>
            <td>
                <c:forEach items="${flag.flagText}" var="flags">${flag.flagText}; </c:forEach>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>