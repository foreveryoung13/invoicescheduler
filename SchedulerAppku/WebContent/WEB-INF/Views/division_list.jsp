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
								<h2 class="panel-title">Division List</h2>
							</div>

							<div class="panel-body">
								<table class="table table-hover">
									<thead>
										<tr>
											<th style="font-size: 12px;"><spring:message
													code="lbl.divisionName" /></th>
											<th style="font-size: 12px;"><spring:message
													code="lbl.edit" /></th>
											<th style="font-size: 12px;"><spring:message
													code="lbl.delete" /></th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="divs" items="${division}">
											<c:url var="updateLink" value="/division/edit">
												<c:param name="divisionId" value="${divs.divisionId}" />
											</c:url>
											<c:url var="deleteLink" value="/division/delete">
												<c:param name="divisionId" value="${divs.divisionId}" />
											</c:url>
											<tr>
												<td style="font-size: 12px;">${divs.divisionName}</td>
												<td style="font-size: 12px;"><a href="${updateLink}"
													class="btn-custom btn-warning"><span
														class="glyphicon glyphicon-pencil"></span></a></td>
												<td><a href="${deleteLink}"
													class="btn-custom btn-danger"
													onclick="if(!(confirm('Are you sure to delete'))) return false"><span
														class="glyphicon glyphicon-trash"></span></a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>

				<!--<a href="${pageContext.request.contextPath}/division/list/1">1</a>     
   						<a href="${pageContext.request.contextPath}/division/list/2">2</a>     
   						<a href="${pageContext.request.contextPath}/division/list/3">3</a> -->

				<div class="row">
					<div class="col-xl-11 col-lg-11 col-md-11 col-sm-11 col-11">
						<a href="<c:url value='/division/add'/>"
							class="btn-custom btn-primary"><span
							class="glyphicon glyphicon-plus"></span></a>
					</div>
				</div>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>

