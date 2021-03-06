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
								<h2 class="panel-title">Edit Invoice</h2>
							</div>
							<div class="panel-body">
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
										<div class="col-sm-6">
											<div class="form-group" id="form-group-custom">
												<label for="customerId" class="col-sm-4 control-label"><spring:message
														code="lbl.customerName" /></label>
												<div class="col-sm-6">
													<form:select path="customerId" items="${customerlist}"
														itemValue="customerId" itemLabel="customerName"
														cssClass="form-control" />
													<form:errors path="customerId" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group" id="form-group-custom">
												<label for="remarksId" class="col-sm-4 control-label"><spring:message
														code="lbl.remarksName" /></label>
												<div class="col-sm-6">
													<form:select path="remarksId" items="${remarklist}"
														itemValue="remarksId" itemLabel="remarksName"
														cssClass="form-control" />
													<form:errors path="remarksId" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group" id="form-group-custom">
												<label for="noPo" class="col-sm-4 control-label"><spring:message
														code="lbl.noPo" /></label>
												<div class="col-sm-6">
													<form:input path="noPo" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="noPo" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group" id="form-group-custom">
												<label for="marketingId" class="col-sm-4 control-label"><spring:message
														code="lbl.marketingName" /></label>
												<div class="col-sm-6">
													<form:select path="marketingId" items="${marketinglist}"
														itemValue="marketingId" itemLabel="firstName"
														cssClass="form-control" />
													<form:errors path="marketingId" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group" id="form-group-custom">
												<label for="noInvoice" class="col-sm-4 control-label"><spring:message
														code="lbl.noInvoice" /></label>
												<div class="col-sm-6">
													<form:input path="noInvoice" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="noInvoice" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group" id="form-group-custom">
												<label for="noPajak" class="col-sm-4 control-label"><spring:message
														code="lbl.noPajak" /></label>
												<div class="col-sm-6">
													<form:input path="noPajak" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="noPajak" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group" id="form-group-custom">
												<label for="tanggalInvoice" class="col-sm-4 control-label"><spring:message
														code="lbl.tanggalInvoice" /></label>
												<div class="col-sm-6">
													<form:input path="tanggalInvoice" id="tanggalInvoice"
														cssClass="form-control" autocomplete="off" readonly="true"/>
													<form:errors path="tanggalInvoice" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group" id="form-group-custom">
												<label for="tanggalTt" class="col-sm-4 control-label"><spring:message
														code="lbl.tanggalTt" /></label>
												<div class="col-sm-6">
													<form:input path="tanggalTt" cssClass="form-control"
														id="tanggalTt" autocomplete="off" readonly="true" />
													<form:errors path="tanggalTt" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group" id="form-group-custom">
												<label for="termId" class="col-sm-4 control-label"><spring:message
														code="lbl.termId" /></label>
												<div class="col-sm-6">
													<form:select path="termId" items="${termlist}"
														itemValue="termId" itemLabel="termName"
														cssClass="form-control" />
													<form:errors path="termId" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>
											
											<div class="form-group" hidden="true">
												<label for="createdBy"
													class="col-sm-4 control-label labelname"><spring:message
														code="lbl.createdBy" /></label>
												<div class="col-sm-6">
													<form:input path="createdBy"
														cssClass="form-control input-sm" readonly="true" />
													<form:errors path="createdBy" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>
											
											<div class="form-group" hidden="true">
												<label for="flag"
													class="col-sm-4 control-label labelname"><spring:message
														code="lbl.flag" /></label>
												<div class="col-sm-6">
													<form:input path="flag"
														cssClass="form-control input-sm" readonly="true" />
													<form:errors path="flag" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>
											
										</div>
										<!-- end left column -->

										<!-- right column -->
										<div class="col-sm-6" style="margin-left: -5em">
											<div class="form-group" id="form-group-custom">
												<label for="tanggalTempo" class="col-sm-4 control-label"><spring:message
														code="lbl.tanggalTempo" /></label>
												<div class="col-sm-6">
													<form:input path="tanggalTempo" cssClass="form-control"
														id="tanggalTempo" autocomplete="off" readonly="true" />
													<form:errors path="tanggalTempo" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group" id="form-group-custom">
												<label for="piutangUsaha" class="col-sm-4 control-label"><spring:message
														code="lbl.piutangUsaha" /></label>
												<div class="col-sm-6">
													<form:input path="piutangUsaha" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="piutangUsaha" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>
											<div class="form-group" id="form-group-custom">
												<label for="projectId" class="col-sm-4 control-label"><spring:message
														code="lbl.projectName" /></label>
												<div class="col-sm-6">
													<form:select path="projectId" items="${projectlist}"
														itemValue="projectId" itemLabel="projectName"
														cssClass="form-control" />
													<form:errors path="projectId" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group" id="form-group-custom">
												<label for="dpp" class="col-sm-4 control-label"><spring:message
														code="lbl.dpp" /></label>
												<div class="col-sm-6">
													<form:input path="dpp" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="dpp" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group" id="form-group-custom">
												<label for="ppn" class="col-sm-4 control-label"><spring:message
														code="lbl.ppn" /></label>
												<div class="col-sm-6">
													<form:input path="ppn" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="ppn" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group row" id="form-group-custom">
												<label for="pph" class="col-sm-4 control-label"><spring:message
														code="lbl.pph" /></label>
												<div class="col-sm-6">
													<form:input path="pph" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="pph" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group row" id="form-group-custom">
												<label for="uangMasuk" class="col-sm-4 control-label"><spring:message
														code="lbl.uangMasuk" /></label>
												<div class="col-sm-6">
													<form:input path="uangMasuk" cssClass="form-control"
														autocomplete="off" />
													<form:errors path="uangMasuk" cssClass="alert-danger-custom" />
													<text class="alert-danger">${message}</text>
												</div>
											</div>

											<div class="form-group row" id="form-group-custom">
												<label for="tanggalLunas" class="col-sm-4 control-label"><spring:message
														code="lbl.tanggalLunas" /></label>
												<div class="col-sm-6">
													<form:input path="tanggalLunas" cssClass="form-control"
														id="tanggalLunas" autocomplete="off" readonly="true" />
													<form:errors path="tanggalLunas" cssClass="alert-danger-custom" />
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
										</div>
										<!-- end right column -->
									</div>

									<div class="form-group row">
										<div class="col-sm-12"
											style="margin-left: 12.4em; margin-top: -1em">
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