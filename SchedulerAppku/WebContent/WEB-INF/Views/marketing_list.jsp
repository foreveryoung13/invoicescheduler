<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="tag" uri="/WEB-INF/taglibs/customTaglib.tld"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">

		<div class="body">
			<div class="container">

				<div class="row">
					<div class="col-xl-11 col-lg-11 col-md-11 col-sm-11 col-11"
						style="margin-top: 0.9em;">
						<div class="panel panel-info">
							<div class="panel-heading">
								<h2 class="panel-title">Marketing List</h2>
							</div>

							<div class="panel-body">
								<table class="table table-hover">
									<thead>
										<tr>
											<th style="font-size: 12px;"><spring:message
													code="lbl.firstName" /></th>
											<th style="font-size: 12px;"><spring:message
													code="lbl.lastName" /></th>
											<th style="font-size: 12px;"><spring:message
													code="lbl.edit" /></th>
											<th style="font-size: 12px;"><spring:message
													code="lbl.delete" /></th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="mark" items="${marketing}">
											<c:url var="updateLink" value="/marketings/edit">
												<c:param name="marketingId" value="${mark.marketingId}" />
											</c:url>
											<c:url var="deleteLink" value="/marketings/delete">
												<c:param name="marketingId" value="${mark.marketingId}" />
											</c:url>
											<tr>
												<td style="font-size: 12px;">${mark.firstName}</td>
												<td style="font-size: 12px;">${mark.lastName}</td>
												<td><a href="${updateLink}"
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

								<tag:paginate max="15" offset="${offset}" count="${count}"
									uri="${pageContext.request.contextPath}/marketings/list"
									next="&raquo;" previous="&laquo;" />

							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-xl-11 col-lg-11 col-md-11 col-sm-11 col-11">
						<a href="<c:url value='/marketings/add'/>"
							class="btn-custom btn-primary"><span
							class="glyphicon glyphicon-plus"></span></a>
					</div>
				</div>


			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>