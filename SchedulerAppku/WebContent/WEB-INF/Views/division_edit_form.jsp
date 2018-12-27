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
								<h2 class="panel-title">Edit Division</h2>
							</div>

							<div class="panel-body">
								<form:form modelAttribute="division"
									action="${pageContext.request.contextPath}/division/editdivision"
									cssClass="form-horizontal" role="form" method="post">

									<div class="form-group" hidden="true">
										<label for="divisionId" class="col-sm-2 control-label"><spring:message
												code="lbl.divisionId" /></label>
										<div class="col-sm-4">
											<form:input path="divisionId"
												cssClass="form-control input-sm" />
											<form:errors path="divisionId" cssClass="alert-danger" />
											<text class="alert-danger">${message}</text>
										</div>
									</div>

									<div class="form-group row">
										<label for="division_name"
											class="col-sm-2 control-label labelname"><spring:message
												code="lbl.divisionName" /></label>
										<div class="col-sm-4">
											<form:input path="divisionName" cssClass="form-control"
												autocomplete="off" />
											<form:errors path="divisionName" cssClass="alert-danger" />
											<text class="alert-danger">${message}</text>
										</div>
									</div>

									<div class="form-group">
										<div class="col-sm-12" style="margin-left: 12.4em">
											<input type="submit" value="Save"
												class="btn btn-primary" name="btnSubmit" />
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