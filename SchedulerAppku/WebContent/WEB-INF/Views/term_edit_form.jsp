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
					<div class="col-xl-11 col-lg-11 col-md-11 col-sm-11 col-11"
						style="margin-top: 0.9em;">
						<div class="panel panel-info">
							<div class="panel-heading">
								<h2 class="panel-title">Edit Term</h2>
							</div>

							<div class="panel-body">
								<form:form modelAttribute="term"
									action="${pageContext.request.contextPath}/term/editterm"
									cssClass="form-horizontal" role="form" method="post">

									<div class="form-group row" hidden="true">
										<label for="termId" class="col-sm-2 control-label"><spring:message
												code="lbl.termId" /></label>
										<div class="col-sm-4">
											<form:input path="termId" cssClass="form-control" />
											<form:errors path="termId" cssClass="alert-danger-custom" />
											<text class="alert-danger">${message}</text>
										</div>
									</div>

									<div class="form-group row">
										<label for="termName" class="col-sm-2 control-label labelname"><spring:message
												code="lbl.termName" /></label>
										<div class="col-sm-4">
											<form:input path="termName" cssClass="form-control"
												autocomplete="off" />
											<form:errors path="termName" cssClass="alert-danger-custom" />
											<text class="alert-danger">${message}</text>
										</div>
									</div>

									<div class="form-group" hidden="true">
										<label for="createdBy"
											class="col-sm-4 control-label labelname"><spring:message
												code="lbl.createdBy" /></label>
										<div class="col-sm-6">
											<form:input path="createdBy" cssClass="form-control input-sm"
												readonly="true" />
											<form:errors path="createdBy" cssClass="alert-danger-custom" />
											<text class="alert-danger">${message}</text>
										</div>
									</div>
									<div class="form-group" hidden="true">
										<label for=createdDate
											class="col-sm-4 control-label labelname"><spring:message
												code="lbl.createdDate" /></label>
										<div class="col-sm-6">
											<form:input path="createdDate"
												cssClass="form-control input-sm" readonly="true" />
											<form:errors path="createdDate" cssClass="alert-danger-custom" />
											<text class="alert-danger">${message}</text>
										</div>
									</div>

									<div class="form-group row">
										<div class="col-sm-12" style="margin-left: 12.4em">
											<input type="submit" value="Save" class="btn btn-primary"
												name="btnSubmit" />
										</div>
									</div>
								</form:form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>