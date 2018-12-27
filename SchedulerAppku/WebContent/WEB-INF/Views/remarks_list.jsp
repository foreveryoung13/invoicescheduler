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
				<!-- <div class="row">
					<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
						<h3 class="page-header" style="margin-left: -0.3em">Remarks List</h3>
					</div>
				</div> -->
				
				<div class="row">
					<div class="col-12">
						<table class="table table-hover">
							<thead>
								<tr>
									<th style="font-size: 12px;"><spring:message code="lbl.remarksName" /></th>
									<th style="font-size: 12px;"><spring:message code="lbl.edit" /></th>
									<th style="font-size: 12px;"><spring:message code="lbl.delete" /></th>
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
										<td style="font-size: 12px;">${pro.remarksName}</td>
										<td><a href="${updateLink}" class="btn-custom btn-warning"><span class="glyphicon glyphicon-pencil"></span></a></td>
										<td><a href="${deleteLink}" class="btn-custom btn-danger"
											onclick="if(!(confirm('Are you sure to delete'))) return false"><span class="glyphicon glyphicon-trash"></span></a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-12">
						<a href="<c:url value='/remark/add'/>" class="btn-custom btn-primary"><span class="glyphicon glyphicon-plus"></span></a>
					</div>
				</div>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>