<%--
  Created by IntelliJ IDEA.
  User: Flashsan
  Date: 02.02.2023
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Edit meetup</title>
</head>

<body>
<h1>Edit Form</h1>
<form action =edit-meetup.jsp" ,ethod="post">
    <input type="hidden" name="id" value="%<=meetup.getId"/>
</form>
<table>
  <tr>
      <td>Name:</td>
      <input type="text" name="name" value="<%=meetup.getName%>"/></td>
  </tr>

</table>

</body>
</html>
