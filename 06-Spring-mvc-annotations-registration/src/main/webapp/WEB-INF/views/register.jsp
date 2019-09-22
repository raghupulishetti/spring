<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<style type="text/css">
.error {
	color: red;
}
</style>
<h2 align="center">
	<spring:message code="user.register" />
</h2>
</head>
<form:form action="register" method="post" commandName="user">
	<spring:message code="user.userId" />:<form:input path="userId" />
	<form:errors path="userId" cssClass="error" />
	<br />
	<spring:message code="user.name" /> :<form:input path="name" />
	<form:errors path="name" cssClass="error" />
	<br />
	<spring:message code="user.email" /> :<form:input path="email" />
	<form:errors path="email" cssClass="error" />
	<br />
	<spring:message code="user.mobile" /> :<form:input path="mobile" />
	<form:errors path="mobile" cssClass="error" />
	<br />
	<input type="submit" value="register" />
</form:form>
</html>
