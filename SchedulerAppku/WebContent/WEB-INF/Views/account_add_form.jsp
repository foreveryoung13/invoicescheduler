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
						<h3 class="page-header">Add Account</h3>
					</div>
				</div>

				<form:form modelAttribute="account" action="saveAccount"
					cssClass="form-horizontal" role="form" method="post">

					<div class="form-group form-group-sm">
						<div class="col-sm-6" style="margin-left: -3em">
							<div class="form-group row">
								<label for="accountNo" class="col-sm-4 control-label labelname"><spring:message
										code="lbl.accountNo" /></label>
								<div class="col-sm-6">
									<form:input path="accountNo" cssClass="form-control" />
									<form:errors path="accountNo" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group row">
								<label for="accountHolderName"
									class="col-sm-4 control-label labelname"><spring:message
										code="lbl.accountHolderName" /></label>
								<div class="col-sm-6">
									<form:input path="accountHolderName" cssClass="form-control" />
									<form:errors path="accountHolderName" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group row">
								<label for="balance" class="col-sm-4 control-label labelname"><spring:message
										code="lbl.balance" /></label>
								<div class="col-sm-6">
									<form:input path="balance" cssClass="form-control" />
									<form:errors path="balance" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>
						</div>

						<div class="col-sm-6" style="margin-left: -3em">
							<div class="form-group row">
								<label for="accountType"
									class="col-sm-4 control-label labelname"><spring:message
										code="lbl.accountType" /></label>
								<div class="col-sm-6">
									<form:select path="accountType" cssClass="form-control">
										<form:option value="">Select Account Type</form:option>
										<form:option value="SAVINGS">Savings</form:option>
										<form:option value="CURRENT">Current</form:option>
									</form:select>
									<form:errors path="accountType" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group row">
								<label for="dateOfBirth"
									class="col-sm-4 control-label labelname"><spring:message
										code="lbl.dob" /></label>
								<div class="col-sm-6">
									<form:input path="dateOfBirth" cssClass="form-control" />
									<form:errors path="dateOfBirth" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group row">
								<label for="psCode" class="col-sm-4 control-label labelname"><spring:message
										code="lbl.psCode" /></label>
								<div class="col-sm-6">
									<form:input path="psCode" cssClass="form-control" />
									<form:errors path="psCode" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>
						</div>
					</div>

					<div class="form-group row">
						<div class="col-sm-12" style="margin-left: 11em; margin-top: -1em;" >
							<input type="submit" value="Save Account" class="btn btn-primary"
								name="btnSubmit" />
						</div>
					</div>

				</form:form>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>