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
					<div class="col-xl-11 col-lg-11 col-md-11 col-sm-11 col-11"
						style="margin-top: 0.9em;">
						<div class="panel panel-info">
							<div class="panel-heading">
								<h2 class="panel-title">Add Marketing</h2>
							</div>

							<div class="panel-body">
								<form:form modelAttribute="marketing"
									action="${pageContext.request.contextPath}/marketings/savemarketing"
									cssClass="form-horizontal" role="form" method="post">

									<div class="form-group form-group-sm">
										<!-- start left column -->
										<div class="col-sm-6">
											<div class="form-group" id="form-group-custom">
												<label for="firstName"
													class="col-sm-4 control-label labelname"><spring:message
														code="lbl.firstName" /></label>
												<div class="col-sm-6">
													<form:input path="firstName" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="firstName" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>
											<div class="form-group row" id="form-group-custom">
												<label for="lastName"
													class="col-sm-4 control-label labelname"><spring:message
														code="lbl.lastName" /></label>
												<div class="col-sm-6">
													<form:input path="lastName" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="lastName" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group row" id="form-group-custom">
												<label for="placeOfBirth"
													class="col-sm-4 control-label labelname"><spring:message
														code="lbl.placeOfBirth" /></label>
												<div class="col-sm-6">
													<form:input path="placeOfBirth" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="placeOfBirth" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group row" id="form-group-custom">
												<label for="dateOfBirth"
													class="col-sm-4 control-label labelname"><spring:message
														code="lbl.dateOfBirth" /></label>
												<div class="col-sm-6">
													<form:input path="dateOfBirth" cssClass="form-control"
														id="dateOfBirth" autocomplete="off" readonly="true"/>
													<form:errors path="dateOfBirth" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group row" id="form-group-custom">
												<label for="age" class="col-sm-4 control-label labelname"><spring:message
														code="lbl.age" /></label>
												<div class="col-sm-6">
													<form:input path="age" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="age" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>
										</div>

										<!-- right column -->
										<div class="col-sm-6" style="margin-left: -6em">
											<div class="form-group row" id="form-group-custom">
												<label for="address"
													class="col-sm-4 control-label labelname"><spring:message
														code="lbl.address" /></label>
												<div class="col-sm-6">
													<form:input path="address" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="address" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group row" id="form-group-custom">
												<label for="city" class="col-sm-4 control-label labelname"><spring:message
														code="lbl.city" /></label>
												<div class="col-sm-6">
													<form:input path="city" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="city" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group row" id="form-group-custom">
												<label for="province"
													class="col-sm-4 control-label labelname"><spring:message
														code="lbl.province" /></label>
												<div class="col-sm-6">
													<form:input path="province" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="province" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group row" id="form-group-custom">
												<label for="country"
													class="col-sm-4 control-label labelname"><spring:message
														code="lbl.country" /></label>
												<div class="col-sm-6">
													<form:input path="country" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="country" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group row" id="form-group-custom">
												<label for="divisionId"
													class="col-sm-4 control-label labelname"><spring:message
														code="lbl.divisionName" /></label>
												<div class="col-sm-6">
													<form:select path="divisionId" items="${divlist}"
														itemValue="divisionId" itemLabel="divisionName"
														cssClass="form-control" />
													<form:errors path="country" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

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

		<script type="text/javascript">
			$(document).ready(function() {
				$(function() {
					$("#dateOfBirth").datepicker({
						dateFormat : "dd/mm/yy"
					});
				});
			});
		</script>

	</tiles:putAttribute>
</tiles:insertDefinition>