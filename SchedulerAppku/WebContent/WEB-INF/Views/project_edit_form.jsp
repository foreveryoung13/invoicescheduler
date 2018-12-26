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
						<h3 class="page-header">Edit Project</h3>
					</div>
				</div>
				<form:form modelAttribute="project"
					action="${pageContext.request.contextPath}/project/editproject"
					cssClass="form-horizontal" role="form" method="post">

					<div class="form-group row" hidden="true">
						<label for="projectId" class="col-sm-2 control-label"><spring:message
								code="lbl.projectId" /></label>
						<div class="col-sm-4">
							<form:input path="projectId" cssClass="form-control" />
							<form:errors path="projectId" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row" style="margin-left: -8em">
						<label for="projectName" class="col-sm-2 control-label labelname"><spring:message
								code="lbl.projectName" /></label>
						<div class="col-sm-4">
							<form:input path="projectName" cssClass="form-control" />
							<form:errors path="projectName" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<div class="col-sm-12" style="margin-left: 8em">
							<input type="submit" value="Save" class="btn btn-primary"
								name="btnSubmit" />
						</div>
					</div>
				</form:form>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>