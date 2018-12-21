<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="menu">
	<div id="wrapper">
		<div id="sidebar-wrapper">
			<ul class="sidebar-nav">
				<li><spring:url value="/home" var="homeUrl" htmlEscape="true" />
					<a href="${homeUrl}">Home</a></li>
				<li><spring:url value="/about" var="aboutUrl" htmlEscape="true" />
					<a href="${aboutUrl}">About</a></li>
				<li><spring:url value="/division/add" var="addDivUrl"
						htmlEscape="true" /> <a href="${addDivUrl}">Add Division</a></li>
			</ul>
		</div>
	</div>
</div>

