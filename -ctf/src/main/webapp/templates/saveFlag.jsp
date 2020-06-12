<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Log in with your account</title>
</head>

<body>
<div>
    <form method="POST" action="/xysavexyFlag">
        <h2>Вход в систему</h2>
        <div>
            <input name="flagTitle" type="text" placeholder="Title"
                   autofocus="true"/>
            <input name="flagKey" type="text" placeholder="FlagKey"/>
            <textarea name="flagText"></textarea>
            <button type="submit">Save</button>
            <h4><a href="/">Index</a></h4>
        </div>
    </form>
</div>

</body>
</html>