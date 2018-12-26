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
						<h2 class="page-header">Remarks List</h2>
					</div>
				</div>
				<div class="row">
					<div class="col-12">
						<table class="table table-hover">
							<thead>
								<tr>
									<th><spring:message code="lbl.remarksName" /></th>
									<th>&nbsp;</th>
									<th>&nbsp;</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="pro" items="${remarks}">
									<c:url var="updateLink" value="/remark/edit">
										<c:param name="remarksId" value="${pro.remarksId}" />
									</c:url>
									<c:url var="deleteLink" value="/remark/delete">
										<c:param name="remarksId" value="${pro.remarksId}" />
									</c:url>
									<tr>
										<td>${pro.remarksName}</td>
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