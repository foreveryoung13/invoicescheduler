<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><spring:message code="lbl.title" /></title>

<style>
.error {
	color: red;
}
</style>

</head>
<body>
	<div class="container">
		<%@ include file="header.jsp"%>

		<div class="row">
			<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
				<h2 class="page-header">Please Fill Up the form details</h2>
			</div>
		</div>

		<div class="row">
			<div class="col-6">
				<form:form modelAttribute="customer" action="${pageContext.request.contextPath}/customer/editcustomer"
					cssClass="form-horizontal" role="form" method="post">

					<div class="form-group row" hidden="true">
						<label for="" class="col-6 col-form-label"></label>
						<div class="col-6">
							<form:input path="customerId" cssClass="form-control" />
							<form:errors path="customerId" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="customerName" class="col-6 col-form-label"><spring:message
								code="lbl.customerName" /></label>
						<div class="col-6">
							<form:input path="customerName" cssClass="form-control" />
							<form:errors path="customerName" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="address" class="col-6 col-form-label"><spring:message
								code="lbl.address" /></label>
						<div class="col-6">
							<form:input path="address" cssClass="form-control" />
							<form:errors path="address" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="city" class="col-6 col-form-label"><spring:message
								code="lbl.city" /></label>
						<div class="col-6">
							<form:input path="city" cssClass="form-control" />
							<form:errors path="city" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="province" class="col-6 col-form-label"><spring:message
								code="lbl.province" /></label>
						<div class="col-6">
							<form:input path="province" cssClass="form-control" />
							<form:errors path="province" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="country" class="col-6 col-form-label"><spring:message
								code="lbl.country" /></label>
						<div class="col-6">
							<form:input path="country" cssClass="form-control" />
							<form:errors path="country" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="faxNumber" class="col-6 col-form-label"><spring:message
								code="lbl.faxNumber" /></label>
						<div class="col-6">
							<form:input path="faxNumber" cssClass="form-control" />
							<form:errors path="faxNumber" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="phoneNumber" class="col-6 col-form-label"><spring:message
								code="lbl.phoneNumber" /></label>
						<div class="col-6">
							<form:input path="phoneNumber" cssClass="form-control" />
							<form:errors path="phoneNumber" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="postalCode" class="col-6 col-form-label"><spring:message
								code="lbl.postalCode" /></label>
						<div class="col-6">
							<form:input path="postalCode" cssClass="form-control" />
							<form:errors path="postalCode" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<div class="offset-6 col-6">
							<input type="submit" value="Save Customer"
								class="btn btn-primary" name="btnSubmit" />
						</div>
					</div>

				</form:form>
			</div>
		</div>

		<%@ include file="footer.jsp"%>
	</div>

</body>
</html>