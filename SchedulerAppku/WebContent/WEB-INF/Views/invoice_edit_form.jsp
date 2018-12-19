<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
				<form:form modelAttribute="invoice"
					action="${pageContext.request.contextPath}/invoice/editinvoice"
					cssClass="form-horizontal" role="form" method="post">

					<div class="form-group row" hidden="true">
						<label for="invoiceId" class="col-6 col-form-label"></label>
						<div class="col-6">
							<form:input path="invoiceId" cssClass="form-control" />
							<form:errors path="invoiceId" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="customerId" class="col-6 col-form-label"><spring:message
								code="lbl.customerName" /></label>
						<div class="col-6">
							<form:select path="customerId" items="${customerlist}"
								itemValue="customerId" itemLabel="customerName" />
							<form:errors path="customerId" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="projectId" class="col-6 col-form-label"><spring:message
								code="lbl.projectName" /></label>
						<div class="col-6">
							<form:select path="projectId" items="${projectlist}"
								itemValue="projectId" itemLabel="projectName" />
							<form:errors path="projectId" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="remarksId" class="col-6 col-form-label"><spring:message
								code="lbl.remarksName" /></label>
						<div class="col-6">
							<form:select path="remarksId" items="${remarklist}"
								itemValue="remarksId" itemLabel="remarksName" />
							<form:errors path="remarksId" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="noPo" class="col-6 col-form-label"><spring:message
								code="lbl.noPo" /></label>
						<div class="col-6">
							<form:input path="noPo" cssClass="form-control" />
							<form:errors path="noPo" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="marketingId" class="col-6 col-form-label"><spring:message
								code="lbl.marketingName" /></label>
						<div class="col-6">
							<form:select path="marketingId" items="${marketinglist}"
								itemValue="marketingId" itemLabel="firstName" />
							<form:errors path="marketingId" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="noInvoice" class="col-6 col-form-label"><spring:message
								code="lbl.noInvoice" /></label>
						<div class="col-6">
							<form:input path="noInvoice" cssClass="form-control" />
							<form:errors path="noInvoice" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="noPajak" class="col-6 col-form-label"><spring:message
								code="lbl.noPajak" /></label>
						<div class="col-6">
							<form:input path="noPajak" cssClass="form-control" />
							<form:errors path="noPajak" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="tanggalInvoice" class="col-6 col-form-label"><spring:message
								code="lbl.tanggalInvoice" /></label>
						<div class="col-6">
							<form:input path="tanggalInvoice" cssClass="form-control" />
							<form:errors path="tanggalInvoice" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="tanggalTt" class="col-6 col-form-label"><spring:message
								code="lbl.tanggalTt" /></label>
						<div class="col-6">
							<form:input path="tanggalTt" cssClass="form-control" />
							<form:errors path="tanggalTt" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="termId" class="col-6 col-form-label"><spring:message
								code="lbl.termId" /></label>
						<div class="col-6">
							<form:select path="termId" items="${termlist}" itemValue="termId"
								itemLabel="termName" />
							<form:errors path="termId" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="tanggalTempo" class="col-6 col-form-label"><spring:message
								code="lbl.tanggalTempo" /></label>
						<div class="col-6">
							<form:input path="tanggalTempo" cssClass="form-control" />
							<form:errors path="tanggalTempo" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="piutangUsaha" class="col-6 col-form-label"><spring:message
								code="lbl.piutangUsaha" /></label>
						<div class="col-6">
							<form:input path="piutangUsaha" cssClass="form-control" />
							<form:errors path="piutangUsaha" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="dpp" class="col-6 col-form-label"><spring:message
								code="lbl.dpp" /></label>
						<div class="col-6">
							<form:input path="dpp" cssClass="form-control" />
							<form:errors path="dpp" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="ppn" class="col-6 col-form-label"><spring:message
								code="lbl.ppn" /></label>
						<div class="col-6">
							<form:input path="ppn" cssClass="form-control" />
							<form:errors path="ppn" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="pph" class="col-6 col-form-label"><spring:message
								code="lbl.pph" /></label>
						<div class="col-6">
							<form:input path="pph" cssClass="form-control" />
							<form:errors path="pph" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="uangMasuk" class="col-6 col-form-label"><spring:message
								code="lbl.uangMasuk" /></label>
						<div class="col-6">
							<form:input path="uangMasuk" cssClass="form-control" />
							<form:errors path="uangMasuk" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="tanggalLunas" class="col-6 col-form-label"><spring:message
								code="lbl.tanggalLunas" /></label>
						<div class="col-6">
							<form:input path="tanggalLunas" cssClass="form-control" />
							<form:errors path="tanggalLunas" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="createdBy" class="col-6 col-form-label"><spring:message
								code="lbl.createdBy" /></label>
						<div class="col-6">
							<form:input path="createdBy" cssClass="form-control" />
							<form:errors path="createdBy" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="createdDate" class="col-6 col-form-label"><spring:message
								code="lbl.createdDate" /></label>
						<div class="col-6">
							<form:input path="createdDate" cssClass="form-control" />
							<form:errors path="createdDate" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="updatedBy" class="col-6 col-form-label"><spring:message
								code="lbl.updatedBy" /></label>
						<div class="col-6">
							<form:input path="updatedBy" cssClass="form-control" />
							<form:errors path="updatedBy" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<label for="updatedDate" class="col-6 col-form-label"><spring:message
								code="lbl.updatedDate" /></label>
						<div class="col-6">
							<form:input path="updatedDate" cssClass="form-control" />
							<form:errors path="updatedDate" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group row">
						<div class="offset-6 col-6">
							<input type="submit" value="Save" class="btn btn-primary"
								name="btnSubmit" />
						</div>
					</div>

				</form:form>
			</div>
		</div>

		<%@ include file="footer.jsp"%>
	</div>

</body>
</html>