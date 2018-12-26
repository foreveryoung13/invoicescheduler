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
						<h3 class="page-header" style="margin-left: -0.3em">Invoice List</h3>
					</div>
				</div>
				<div class="row">
					<div class="col-12">
						<table class="table table-hover">
							<thead>
								<tr>
									<th style="font-size: 12px;"><spring:message code="lbl.noPo" /></th>
									<th style="font-size: 12px;"><spring:message code="lbl.noInvoice" /></th>
									<th style="font-size: 12px;"><spring:message code="lbl.noPajak" /></th>
									<th>&nbsp;</th>
									<th>&nbsp;</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="inv" items="${invoice}">
									<c:url var="updateLink" value="/invoice/edit">
										<c:param name="invoiceId" value="${inv.invoiceId}" />
									</c:url>
									<c:url var="deleteLink" value="/invoice/delete">
										<c:param name="invoiceId" value="${inv.invoiceId}" />
									</c:url>
									<tr>
										<td style="font-size: 12px;">${inv.noPo}</td>
										<td style="font-size: 12px;">${inv.noInvoice}</td>
										<td style="font-size: 12px;">${inv.noPajak}</td>
										<td><a href="${updateLink}" class="btn btn-warning">Edit</a></td>
										<td><a href="${deleteLink}" class="btn btn-danger"
											onclick="if(!(confirm('Are you sure to delete'))) return false">Delete</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				
				<div class="row">
					<div class="col-12">
						<a href="<c:url value='/invoice/add'/>" class="btn btn-primary">Add
							Invoice</a>
					</div>
				</div>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>