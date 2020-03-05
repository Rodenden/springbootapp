<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vote Teacher</title>
</head>
<body>
<c:set var="teacher" value="${teacher}"/>
Вы голосуете за ${teacher.name} ${teacher.surname}
<br><img src="${teacher.photoURL}" style="height: 15pc">
</body>
</html>
