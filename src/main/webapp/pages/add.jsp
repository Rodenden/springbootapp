<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Teacher</title>
</head>
<body>
<form action="/addTeacher" method="post">
    <input type="text" placeholder="Имя препода" name="name">
    <input type="text" placeholder="Фамилия препода" name="surname">
    <input type="number" placeholder="Сколько ему лет" name="age">
    <input type="text" placeholder="Ссылка на фотку" name="url">
    <input type="submit" value="Добавить">
</form>
</body>
</html>
