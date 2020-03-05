<%@ page import="ru.roden.springbootapp.model.Teacher" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="button" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All</title>
</head>
<body>
<table>
<%List<Teacher> teachers = (List<Teacher>) request.getAttribute("all");
    Integer currentYear = (Integer) request.getAttribute("thisYear");%>
    <%for (int i = 0; i < teachers.size(); i++) {
            if (i % 6 == 0){ %> <tr> <%}%>
    <td align="center">
        <img src="<%=teachers.get(i).getPhotoURL()%>" style="height: 15pc">
        <br><%=teachers.get(i).getName()%>
        <br><%=teachers.get(i).getSurname()%>
        <br>Рейтинг: <%=teachers.get(i).getRating()%> <a href="/vote/<%=teachers.get(i).getId()%>"><button>Голосовать</button></a>
        <br>Лет: <%=(currentYear - teachers.get(i).getBornYear())%>
    </td>
    <%if (i % 6 == 0 & i != 0){ %> </tr> <%}%>
        <% } %>
</table>
</body>
</html>
