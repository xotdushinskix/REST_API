<%--
  Created by IntelliJ IDEA.
  User: FromxSoul
  Date: 17.07.2016
  Time: 0:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title></title>
</head>
<body>
    <h4>User's edit page</h4>
    <form:form action="${pageContext.request.contextPath}/users/edit/${user.id}" commandName="user" method="post">
        <table>
            <tr>
                <td>User first name:</td>
                <td><form:input path="firstName"/></td>
                <td><form:errors path="firstName"/></td>
            </tr>
            <tr>
                <td>User last name:</td>
                <td><form:input path="lastName"/></td>
                <td><form:errors path="lastName"/></td>
            </tr>
            <tr>
                <td>User age:</td>
                <td><form:input path="age"/></td>
                <td><form:errors path="age"/></td>
            </tr>
            <tr>
                <td>User login:</td>
                <td><form:input path="login"/></td>
                <td><form:errors path="login"/></td>
            </tr>
            <tr>
                <td>User password:</td>
                <td><form:input path="password"/></td>
                <td><form:errors path="password"/></td>
            </tr>
        </table>
        <input type="submit" value="Edit" />
    </form:form>
</body>
</html>
