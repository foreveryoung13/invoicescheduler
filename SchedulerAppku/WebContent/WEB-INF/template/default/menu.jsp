<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="menu">
	<div id="wrapper">
		<div id="sidebar-wrapper">
			<ul class="sidebar-nav">
				<li><spring:url value="/home" var="homeUrl" htmlEscape="true" />
					<a href="${homeUrl}">Home</a></li>
				<li><spring:url value="/about" var="aboutUrl" htmlEscape="true" />
					<a href="${aboutUrl}">About</a></li>
				<li><spring:url value="/division/list" var="listDivUrl"
						htmlEscape="true" /> <a href="${listDivUrl}">Division</a></li>
				<li><spring:url value="/customer/list" var="listCustUrl"
						htmlEscape="true" /> <a href="${listCustUrl}">Customer</a></li>
				<li><spring:url value="/email/list" var="listEmailUrl"
						htmlEscape="true" /> <a href="${listEmailUrl}">Email</a></li>
				<li><spring:url value="/marketings/list" var="listMarketingUrl"
						htmlEscape="true" /> <a href="${listMarketingUrl}">Marketing</a></li>
			</ul>
		</div>
	</div>
</div>

