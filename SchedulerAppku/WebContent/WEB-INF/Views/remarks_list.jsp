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
</head>
<body>

	<div class="container">
		<%@ include file="header.jsp"%>

		<div class="row">
			<div class="col-12">
				<a href="<c:url value='newremarks'/>" class="btn btn-primary">Add
					New Project</a>
			</div>
		</div>

		<div class="row">
			<div class="col-12">
				<table class="table table-bordered table-hover">
					<thead>
						<tr>
							<th><spring:message code="lbl.remarksName" /></th>
							<th>&nbsp;</th>
							<th>&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="pro" items="${remarks}">
							<c:url var="updateLink" value="/remarksedit">
								<c:param name="remarksId" value="${pro.remarksId}" />
							</c:url>
							<c:url var="deleteLink" value="/remarksdelete">
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

		<%@ include file="footer.jsp"%>
	</div>

</body>
</html>