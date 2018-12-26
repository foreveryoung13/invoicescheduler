<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">

		<div class="body">
			<div class="container">
				<div class="row">
					<div class="col-xl-9 col-lg-9 col-md-9 col-sm-9 col-9"
						style="margin-top: 1em">
						<div class="panel panel-info">
							<div class="panel-heading">
								<div>
									<h2 class="panel-title">About page !</h2>
								</div>
							</div>
						</div>
					</div>
				</div>
				<p>This is a simple example of Tiles 3 integration with Spring
					Framework.</p>
				<p>Uses Tiles 3.0.3 and springframework 3.2.7.</P>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>