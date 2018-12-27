<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="header">
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!--  <a class="navbar-brand" href="#">Project name</a> -->
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<!--<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
					<li><a href="#contact">Contact</a></li>
				</ul> -->
			</div>

			<div class="row">
				<div class="col-12">
					<c:url value="/logout" var="logoutUrl" />

					<form action="${logoutUrl}" method="post" id="LogoutForm">
						<input type="hidden" name="${csrf.parameterName}"
							value="${_csrf.token}" />
					</form>

					<script type="text/javascript">
						function formSubmit() {
							document.getElementById("LogoutForm").submit();
						}
					</script>

					<p class="display-5">
						Welcome : ${username}, <a href="javascript:formSubmit()">
							Logout </a>
					</p>

				</div>
			</div>

		</div>
	</nav>
</div>
