<%--
  Created by IntelliJ IDEA.
  User: Flashsan
  Date: 08.02.2023
  Time: 00:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Meetup </title>
</head>
<body>
<header>

</header>
<br>
<div class="container col-md-5">
  <div class=""card-body">
<c:if test ="${meetup !=null}">
  <form action="update" method="post"></form>
</c:if></div>

<c:if test ="${meetup !=null}">
  <form action="update" method="post">
</c:if></div>

<caption>
  <h2>
    <c:if test="${meetup !=null}">
      Edit Meetup
    </c:if>

    <c:if test="${meetup !=null}">
      Add New Meetup
    </c:if>
  </h2>
</caption>

<c:if test ="${meetup != null}">
  <input type="hidden" name="id" value="<c:out value='${user.id}' />" />
</c:if>

<fieldset class="form-group">
  <label>Name</label> <input type="text" value="<c:out value='${meetup.name}' />" class="form-control" name="email">
</fieldset>

<button type ="submit"> Save</button>
  </form>
</body>




</div>


</body>
</html>
