<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
            <input name="id" type="text" placeholder="Flag id"
                   autofocus="true"/>
            <input name="flagKey" type="text" placeholder="flagKey"/>
            <button type="submit">Log In</button>
            <h4><a href="/registration">Зарегистрироваться</a></h4>
        </div>
    </form>
</div>

</body>
</html>