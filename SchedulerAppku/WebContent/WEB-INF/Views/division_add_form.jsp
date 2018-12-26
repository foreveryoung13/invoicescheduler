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
						<h2 class="page-header">Add Division</h2>
					</div>
				</div>
				<form:form modelAttribute="division"
					action="${pageContext.request.contextPath}/division/savedivision"
					cssClass="form-horizontal" role="form" method="post">

					<div class="form-group">
						<label for="divisionName" class="col-sm-2 control-label labelname"><spring:message
								code="lbl.divisionName" /></label>
						<div class="col-sm-4">
							<form:input path="divisionName" cssClass="form-control input-sm"
								autocomplete="false" />
							<form:errors path="divisionName" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<input type="submit" value="Save Division"
								class="btn btn-primary" name="btnSubmit" />
						</div>
					</div>
				</form:form>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>
