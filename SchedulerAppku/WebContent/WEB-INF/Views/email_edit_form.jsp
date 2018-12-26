<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">

		<div class="body">
			<div class="container">
				<div class="row">
					<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
						<h2 class="page-header">Edit Email</h2>
					</div>
				</div>
				<form:form modelAttribute="email"
					action="${pageContext.request.contextPath}/email/editemail"
					cssClass="form-horizontal" role="form" method="post">

					<div class="form-group row" hidden="true">
						<label for="emailId" class="col-sm-2 control-label"><spring:message
								code="lbl.emailId" /></label>
						<div class="col-sm-4">
							<form:input path="emailId" cssClass="form-control" />
							<form:errors path="emailId" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="sender" class="col-sm-2 control-label"><spring:message
								code="lbl.sender" /></label>
						<div class="col-sm-4">
							<form:input path="sender" cssClass="form-control" />
							<form:errors path="sender" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="recipients" class="col-sm-2 control-label"><spring:message
								code="lbl.recipients" /></label>
						<div class="col-sm-4">
							<form:input path="recipients" cssClass="form-control" />
							<form:errors path="recipients" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="subject" class="col-sm-2 control-label"><spring:message
								code="lbl.subject" /></label>
						<div class="col-sm-4">
							<form:input path="subject" cssClass="form-control" />
							<form:errors path="subject" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="header" class="col-sm-2 control-label"><spring:message
								code="lbl.header" /></label>
						<div class="col-sm-4">
							<form:input path="header" cssClass="form-control" />
							<form:errors path="header" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="footer" class="col-sm-2 control-label"><spring:message
								code="lbl.footer" /></label>
						<div class="col-sm-4">
							<form:input path="footer" cssClass="form-control" />
							<form:errors path="footer" cssClass="alert-danger" />
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