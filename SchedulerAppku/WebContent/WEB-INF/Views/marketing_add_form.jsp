<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">

		<div class="body">
			<div class="container">
				<div class="row">
					<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
						<h2 class="page-header">Add Marketing</h2>
					</div>
				</div>
				<form:form modelAttribute="marketing"
					action="${pageContext.request.contextPath}/marketings/savemarketing"
					cssClass="form-horizontal" role="form" method="post">

					<div class="form-group row">
						<label for="firstName" class="col-sm-2 control-label"><spring:message
								code="lbl.firstName" /></label>
						<div class="col-sm-4">
							<form:input path="firstName" cssClass="form-control" />
							<form:errors path="firstName" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="lastName" class="col-sm-2 control-label labelname"><spring:message
								code="lbl.lastName" /></label>
						<div class="col-sm-4">
							<form:input path="lastName" cssClass="form-control" />
							<form:errors path="lastName" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="placeOfBirth" class="col-sm-2 control-label labelname"><spring:message
								code="lbl.placeOfBirth" /></label>
						<div class="col-sm-4">
							<form:input path="placeOfBirth" cssClass="form-control" />
							<form:errors path="placeOfBirth" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="dateOfBirth" class="col-sm-2 control-label labelname"><spring:message
								code="lbl.dateOfBirth" /></label>
						<div class="col-sm-4">
							<form:input path="dateOfBirth" cssClass="form-control" />
							<form:errors path="dateOfBirth" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="age" class="col-sm-2 control-label labelname"><spring:message
								code="lbl.age" /></label>
						<div class="col-sm-4">
							<form:input path="age" cssClass="form-control" />
							<form:errors path="age" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="address" class="col-sm-2 control-label labelname"><spring:message
								code="lbl.address" /></label>
						<div class="col-sm-4">
							<form:input path="address" cssClass="form-control" />
							<form:errors path="address" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="city" class="col-sm-2 control-label labelname"><spring:message
								code="lbl.city" /></label>
						<div class="col-sm-4">
							<form:input path="city" cssClass="form-control" />
							<form:errors path="city" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="province" class="col-sm-2 control-label labelname"><spring:message
								code="lbl.province" /></label>
						<div class="col-sm-4">
							<form:input path="province" cssClass="form-control" />
							<form:errors path="province" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="country" class="col-sm-2 control-label labelname"><spring:message
								code="lbl.country" /></label>
						<div class="col-sm-4">
							<form:input path="country" cssClass="form-control" />
							<form:errors path="country" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="divisionId" class="col-sm-2 control-label labelname"><spring:message
								code="lbl.divisionName" /></label>
						<div class="col-sm-4">
							<form:select path="divisionId" items="${divlist}"
								itemValue="divisionId" itemLabel="divisionName" />
							<form:errors path="country" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<div class="col-sm-offset-2 col-sm-10">
							<input type="submit" value="Save" class="btn btn-primary"
								name="btnSubmit" />
						</div>
					</div>
				</form:form>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>