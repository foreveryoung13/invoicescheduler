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
						<h3 class="page-header">Edit Invoice</h3>
					</div>
				</div>
				<form:form modelAttribute="invoice"
					action="${pageContext.request.contextPath}/invoice/editinvoice"
					cssClass="form-horizontal" role="form" method="post">

					<div class="form-group row" hidden="true">
						<label for="invoiceId" class="col-sm-2 control-label"></label>
						<div class="col-sm-4">
							<form:input path="invoiceId" cssClass="form-control" />
							<form:errors path="invoiceId" cssClass="alert-danger" />
							<text class="alert-danger">${message}</text>
						</div>
					</div>

					<div class="form-group form-group-sm">
						<!-- start left column -->
						<div class="col-sm-6" style="margin-left: -5em">
							<div class="form-group">
								<label for="customerId" class="col-sm-4 control-label"><spring:message
										code="lbl.customerName" /></label>
								<div class="col-sm-6">
									<form:select path="customerId" items="${customerlist}"
										itemValue="customerId" itemLabel="customerName" cssClass="drop-custom" />
									<form:errors path="customerId" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group">
								<label for="remarksId" class="col-sm-4 control-label"><spring:message
										code="lbl.remarksName" /></label>
								<div class="col-sm-6">
									<form:select path="remarksId" items="${remarklist}"
										itemValue="remarksId" itemLabel="remarksName" cssClass="drop-custom" />
									<form:errors path="remarksId" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group">
								<label for="noPo" class="col-sm-4 control-label"><spring:message
										code="lbl.noPo" /></label>
								<div class="col-sm-6">
									<form:input path="noPo" cssClass="form-control"
										autocomplete="off" />
									<form:errors path="noPo" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group">
								<label for="marketingId" class="col-sm-4 control-label"><spring:message
										code="lbl.marketingName" /></label>
								<div class="col-sm-6">
									<form:select path="marketingId" items="${marketinglist}"
										itemValue="marketingId" itemLabel="firstName" cssClass="drop-custom" />
									<form:errors path="marketingId" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group">
								<label for="noInvoice" class="col-sm-4 control-label"><spring:message
										code="lbl.noInvoice" /></label>
								<div class="col-sm-6">
									<form:input path="noInvoice" cssClass="form-control"
										autocomplete="off" />
									<form:errors path="noInvoice" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group">
								<label for="noPajak" class="col-sm-4 control-label"><spring:message
										code="lbl.noPajak" /></label>
								<div class="col-sm-6">
									<form:input path="noPajak" cssClass="form-control"
										autocomplete="off" />
									<form:errors path="noPajak" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group">
								<label for="tanggalInvoice" class="col-sm-4 control-label"><spring:message
										code="lbl.tanggalInvoice" /></label>
								<div class="col-sm-6">
									<form:input path="tanggalInvoice" id="tanggalInvoice"
										cssClass="form-control" autocomplete="off" />
									<form:errors path="tanggalInvoice" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group">
								<label for="tanggalTt" class="col-sm-4 control-label"><spring:message
										code="lbl.tanggalTt" /></label>
								<div class="col-sm-6">
									<form:input path="tanggalTt" cssClass="form-control"
										id="tanggalTt" autocomplete="off" />
									<form:errors path="tanggalTt" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group">
								<label for="termId" class="col-sm-4 control-label"><spring:message
										code="lbl.termId" /></label>
								<div class="col-sm-6">
									<form:select path="termId" items="${termlist}"
										itemValue="termId" itemLabel="termName" cssClass="drop-custom" />
									<form:errors path="termId" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group">
								<label for="tanggalTempo" class="col-sm-4 control-label"><spring:message
										code="lbl.tanggalTempo" /></label>
								<div class="col-sm-6">
									<form:input path="tanggalTempo" cssClass="form-control"
										id="tanggalTempo" autocomplete="off" />
									<form:errors path="tanggalTempo" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group">
								<label for="piutangUsaha" class="col-sm-4 control-label"><spring:message
										code="lbl.piutangUsaha" /></label>
								<div class="col-sm-6">
									<form:input path="piutangUsaha" cssClass="form-control"
										autocomplete="off" />
									<form:errors path="piutangUsaha" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>
						</div>
						<!-- end left column -->

						<!-- right column -->
						<div class="col-sm-6" style="margin-left: -5em">
							<div class="form-group">
								<label for="projectId" class="col-sm-4 control-label"><spring:message
										code="lbl.projectName" /></label>
								<div class="col-sm-6">
									<form:select path="projectId" items="${projectlist}"
										itemValue="projectId" itemLabel="projectName" cssClass="drop-custom" />
									<form:errors path="projectId" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group">
								<label for="dpp" class="col-sm-4 control-label"><spring:message
										code="lbl.dpp" /></label>
								<div class="col-sm-6">
									<form:input path="dpp" cssClass="form-control"
										autocomplete="off" />
									<form:errors path="dpp" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group">
								<label for="ppn" class="col-sm-4 control-label"><spring:message
										code="lbl.ppn" /></label>
								<div class="col-sm-6">
									<form:input path="ppn" cssClass="form-control"
										autocomplete="off" />
									<form:errors path="ppn" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group row">
								<label for="pph" class="col-sm-4 control-label"><spring:message
										code="lbl.pph" /></label>
								<div class="col-sm-6">
									<form:input path="pph" cssClass="form-control"
										autocomplete="off" />
									<form:errors path="pph" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group row">
								<label for="uangMasuk" class="col-sm-4 control-label"><spring:message
										code="lbl.uangMasuk" /></label>
								<div class="col-sm-6">
									<form:input path="uangMasuk" cssClass="form-control"
										autocomplete="off" />
									<form:errors path="uangMasuk" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group row">
								<label for="tanggalLunas" class="col-sm-4 control-label"><spring:message
										code="lbl.tanggalLunas" /></label>
								<div class="col-sm-6">
									<form:input path="tanggalLunas" cssClass="form-control"
										id="tanggalLunas" autocomplete="off" />
									<form:errors path="tanggalLunas" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group row">
								<label for="createdBy" class="col-sm-4 control-label"><spring:message
										code="lbl.createdBy" /></label>
								<div class="col-sm-6">
									<form:input path="createdBy" cssClass="form-control"
										autocomplete="off" />
									<form:errors path="createdBy" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group row">
								<label for="createdDate" class="col-sm-4 control-label"><spring:message
										code="lbl.createdDate" /></label>
								<div class="col-sm-6">
									<form:input path="createdDate" cssClass="form-control"
										id="createdDate" autocomplete="off" />
									<form:errors path="createdDate" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group row">
								<label for="updatedBy" class="col-sm-4 control-label"><spring:message
										code="lbl.updatedBy" /></label>
								<div class="col-sm-6">
									<form:input path="updatedBy" cssClass="form-control"
										autocomplete="off" />
									<form:errors path="updatedBy" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>

							<div class="form-group row">
								<label for="updatedDate" class="col-sm-4 control-label"><spring:message
										code="lbl.updatedDate" /></label>
								<div class="col-sm-6">
									<form:input path="updatedDate" cssClass="form-control"
										id="updatedDate" autocomplete="off" />
									<form:errors path="updatedDate" cssClass="alert-danger" />
									<text class="alert-danger">${message}</text>
								</div>
							</div>
						</div>
						<!-- end right column -->
					</div>

					<div class="form-group row">
						<div class="col-sm-12" style="margin-left: 9em; margin-top: -1em">
							<input type="submit" value="Save" class="btn btn-primary"
								name="btnSubmit" />
						</div>
					</div>

				</form:form>
			</div>
		</div>

		<script type="text/javascript">
			$(document).ready(function() {
				$(function() {
					$("#tanggalInvoice").datepicker({
						dateFormat : "dd/mm/yy"
					});
				});
			});

			$(document).ready(function() {
				$(function() {
					$("#tanggalTt").datepicker({
						dateFormat : "dd/mm/yy"
					});
				});
			});

			$(document).ready(function() {
				$(function() {
					$("#tanggalTempo").datepicker({
						dateFormat : "dd/mm/yy"
					});
				});
			});

			$(document).ready(function() {
				$(function() {
					$("#tanggalLunas").datepicker({
						dateFormat : "dd/mm/yy"
					});
				});
			});

			$(document).ready(function() {
				$(function() {
					$("#createdDate").datepicker({
						dateFormat : "dd/mm/yy"
					});
				});
			});

			$(document).ready(function() {
				$(function() {
					$("#updatedDate").datepicker({
						dateFormat : "dd/mm/yy"
					});
				});
			});
		</script>

	</tiles:putAttribute>
</tiles:insertDefinition>