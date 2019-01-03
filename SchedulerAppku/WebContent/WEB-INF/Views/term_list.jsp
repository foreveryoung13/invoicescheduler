<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
								<h2 class="panel-title">Term List</h2>
							</div>
							<div class="panel-body">
								<table class="table table-hover">
									<thead>
										<tr>
											<th class="labelname"><spring:message code="lbl.termName" /></th>
											<th class="labelname"><spring:message code="lbl.createdBy" /></th>
											<th class="labelname"><spring:message code="lbl.createdDate" /></th>
											<th class="labelname"><spring:message code="lbl.edit" /></th>
											<th class="labelname"><spring:message code="lbl.delete" /></th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="term" items="${term}">
											<c:url var="updateLink" value="/term/edit">
												<c:param name="termId" value="${term.termId}" />
											</c:url>
											<c:url var="deleteLink" value="/term/delete">
												<c:param name="termId" value="${term.termId}" />
											</c:url>
											<tr>
												<c:set value="${term.createdDate}" var="createdDate" />
												<fmt:parseDate value="${createdDate}" var="createdDateOut" pattern="yyyy-MM-dd HH:mm:ss" />
											
												<td class="labelname">${term.termName}</td>
												<td class="labelname">${term.createdBy}</td>
												<td class="labelname"><fmt:formatDate value="${createdDateOut}" pattern="dd/MM/yyyy" /></td>
												
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
									uri="${pageContext.request.contextPath}/term/list"
									next="&raquo;" previous="&laquo;" />

							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-xl-11 col-lg-11 col-md-11 col-sm-11 col-11">
						<a href="<c:url value='/term/add'/>"
							class="btn-custom btn-primary"><span
							class="glyphicon glyphicon-plus"></span></a>
					</div>
				</div>
			</div>
		</div>
	</tiles:putAttribute>
</tiles:insertDefinition>