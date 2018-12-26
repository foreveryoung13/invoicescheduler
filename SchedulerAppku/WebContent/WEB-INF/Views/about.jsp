<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">

		<div class="body">
			<div class="container">
				<div class="row">
					<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
						<h2 class="page-header">About page !</h2>
					</div>
				</div>

				<p>This is a simple example of Tiles 3 integration with Spring
					Framework.</p>
				<p>Uses Tiles 3.0.3 and springframework 3.2.7.</P>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>