<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>

	<div class="container">
		<%@ include file="header.jsp"%>

		<div class="col-6 offset-3 align-self-center">
			<div class="card">
				<div class="card-header bg-info text-white">
					<h4>LOGIN</h4>
				</div>
				<div class="card-body">
					<form:form modelAttribute="member"
						action="${pageContext.request.contextPath}/user/login"
						cssClass="form-horizontal" role="form" method="post">

						<div class="form-group">
							<label for="Username">User Name :</label>
							<form:input path="username" cssClass="form-control"
								autocomplete="off" placeholder="Enter Username" />
						</div>
						<div class="form-group">
							<label for="Password">Password :</label>
							<form:password path="password" cssClass="form-control"
								autocomplete="off" placeholder="Enter Password" />
						</div>
						<div class="form-group row">
							<div class="col-sm-12" style="margin-left: 12.4em">
								<input type="submit" value="Login" class="btn btn-primary"
									name="btnSubmit" />
							</div>
						</div>
					</form:form>
					<div class="row">
						<div class="col-12">
							<c:if test="${not empty error} ">
								<p class="alert-danger">${error}</p>
							</c:if>
							<c:if test="${not empty msg} ">
								<p class="alert-warning">${msg}</p>
							</c:if>
						</div>
					</div>
				</div>
			</div>
		</div>
		<%@ include file="footer.jsp"%>
	</div>

</body>
</html>