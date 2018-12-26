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
						<h3 class="page-header">Add Project</h3>
					</div>
				</div>
				<form:form modelAttribute="project"
					action="${pageContext.request.contextPath}/project/saveproject"
					cssClass="form-horizontal" role="form" method="post">

					<div class="form-group row">
						<label for="projectName" class="col-sm-2 control-label labelname"><spring:message
								code="lbl.projectName" /></label>
						<div class="col-sm-4">
							<form:input path="projectName" cssClass="form-control" />
							<form:errors path="projectName" cssClass="alert-danger" />
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