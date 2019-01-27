<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
</head>
<body>

	<div class="container">
		<%@ include file="header.jsp"%>
		<div class="row">
			<h1>${errorMsg}</h1>
		</div>

		<%@ include file="footer.jsp"%>
	</div>

</body>
</html>