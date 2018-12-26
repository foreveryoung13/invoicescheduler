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
					<div class="col-12">
						<table class="table table-hover">
							<thead>
								<tr>
									<th><spring:message code="lbl.sender" /></th>
									<th><spring:message code="lbl.recipients" /></th>
									<th><spring:message code="lbl.subject" /></th>
									<th><spring:message code="lbl.header" /></th>
									<th><spring:message code="lbl.footer" /></th>
									<th>&nbsp;</th>
									<th>&nbsp;</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="email" items="${email}">
									<c:url var="updateLink" value="/email/edit">
										<c:param name="emailId" value="${email.emailId}" />
									</c:url>
									<c:url var="deleteLink" value="/email/delete">
										<c:param name="emailId" value="${email.emailId}" />
									</c:url>
									<tr>
										<td>${email.sender}</td>
										<td>${email.recipients}</td>
										<td>${email.subject}</td>
										<td>${email.header}</td>
										<td>${email.footer}</td>
										<td><a href="${updateLink}" class="btn btn-warning">Edit</a></td>
										<td><a href="${deleteLink}" class="btn btn-danger"
											onclick="if(!(confirm('Are you sure to delete'))) return false">Delete</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>