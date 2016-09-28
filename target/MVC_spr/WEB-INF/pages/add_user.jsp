<%--
  Created by IntelliJ IDEA.
  User: FromxSoul
  Date: 20.07.2016
  Time: 0:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title></title>
</head>
<body>
  <form:form action="${pageContext.request.contextPath}/users/add" commandName="user" method="post">
    <table>
      <tr>
        <td>First name:</td>
        <td><form:input path="firstName"/></td>
        <td><form:errors path="firstName"/></td>
      </tr>
      <tr>
        <td>Last name:</td>
        <td><form:input path="lastName"/></td>
        <td><form:errors path="lastName"/></td>
      </tr>
      <tr>
        <td>Age:</td>
        <td><form:input path="age"/></td>
        <td><form:errors path="age"/></td>
      </tr>
      <tr>
        <td>Login:</td>
        <td><form:input path="login"/></td>
        <td><form:errors path="login"/></td>
      </tr>
      <tr>
        <td>Password:</td>
        <td><form:input path="password"/></td>
        <td><form:errors path="password"/></td>
      </tr>
    </table>
    <input type="submit" value="Add" />
  </form:form>
</body>
</html>
