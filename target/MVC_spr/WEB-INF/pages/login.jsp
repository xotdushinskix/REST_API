<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login page</title>
    <%--<link href="<c:url value='/static/css/bootstrap.css' />"  rel="stylesheet"></link>--%>
    <%--<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>--%>
    <link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
</head>

<body>

<%--<form:form action="${pageContext.request.contextPath}/login" commandName="user" method="post">--%>
    <%--<table>--%>
        <%--<tr>Login:--%>
            <%--<td>Login</td>--%>
            <%--<td><form:input path="login"/></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>Password</td>--%>
            <%--<td><form:input path="password"/></td>--%>
        <%--</tr>--%>
    <%--</table>--%>
    <%--<input type="submit" value="Login" />--%>
<%--</form:form>--%>

<form action="/login" method="post">
        Login: <input type="text" name="login"> <br>
        Password: <input type="text" name="password"> <br>
        <%--<input type="hidden" name="${_csrf.Pa}" value="${_csrf.token}"/>--%>
        <input type="submit" value="login"/>
</form>

<%--<div id="mainWrapper">--%>
    <%--<div class="login-container">--%>
        <%--<div class="login-card">--%>
            <%--<div class="login-form">--%>
                <%--&lt;%&ndash;<c:url var="loginUrl" value="/login" />&ndash;%&gt;--%>
                <%--<form action="${pageContext.request.contextPath}/login" method="post" class="form-horizontal">--%>
                    <%--<c:if test="${param.error != null}">--%>
                        <%--<div class="alert alert-danger">--%>
                            <%--<p>Invalid username and password.</p>--%>
                        <%--</div>--%>
                    <%--</c:if>--%>
                    <%--<c:if test="${param.logout != null}">--%>
                        <%--<div class="alert alert-success">--%>
                            <%--<p>You have been logged out successfully.</p>--%>
                        <%--</div>--%>
                    <%--</c:if>--%>
                    <%--<div class="input-group input-sm">--%>
                        <%--<label class="input-group-addon" for="username"><i class="fa fa-user"></i></label>--%>
                        <%--<input type="text" class="form-control" id="username" name="ssoId" placeholder="Enter Username" required>--%>
                    <%--</div>--%>
                    <%--<div class="input-group input-sm">--%>
                        <%--<label class="input-group-addon" for="password"><i class="fa fa-lock"></i></label>--%>
                        <%--<input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" required>--%>
                    <%--</div>--%>
                    <%--<input type="hidden" name="${_csrf.parameterName}"   value="${_csrf.token}" />--%>

                    <%--<div class="form-actions">--%>
                        <%--<input type="submit"--%>
                               <%--class="btn btn-block btn-primary btn-default" value="Log in">--%>
                    <%--</div>--%>
                <%--</form>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>

</body>
</html>
