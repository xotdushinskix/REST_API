<%--
  Created by IntelliJ IDEA.
  User: FromxSoul
  Date: 16.07.2016
  Time: 0:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title></title>
</head>
<body>
<h3>All users list:</h3>
  <table border="2">
    <thead>
    <tr>
      <th>Id</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Age</th>
      <th>Login</th>
      <th>Password</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listUser}" var="user">
      <tr>
        <form:form action="${pageContext.request.contextPath}/users/delete/${user.id}" commandName="user">
        <td><input type="text" value="${user.id}"></td>
        <td>${user.firstName}</td>
        <td>${user.lastName}</td>
        <td>${user.age}</td>
          <td>${user.login}</td>
          <td>${user.password}</td>
        <td><a href="<c:url value='/users/edit/${user.id}'/>">Edit</a></td>
        <td><input type="submit" value="Delete"></td>
        </form:form>
      </tr>
    </c:forEach>
    </tbody>
  </table>
<br>
<a href="<c:url value='/users/add'/>">Add new User</a>
</body>
</html>
