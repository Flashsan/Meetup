<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Info about meetups</title>
</head>

</body>

<h1>Meetups List</h1>

<br/><a href="add-meetup.jsp">Add new meetup</a>
<table border="1" width="100%">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Edit</th>
        <th>Delete</th>
        <c:forEach items="${listMeetups}" var="listMeetup">
            <td>${listMeetup.getId}</td>
            <td>${listMeetup.getName}</td>
            <td><a href="edit-meetup.jsp?id=${listMeetup.getId()}">Edit</a></td>
            <td><a href="delete-meetup.jsp?id=${listMeetup.getId()}">Edit</a></td>
        </c:forEach>
    </tr>
</table>
</html>