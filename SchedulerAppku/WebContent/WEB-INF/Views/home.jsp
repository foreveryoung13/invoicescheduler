<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">

		<div class="body">
			<div class="container">
				<div class="row">
					<div class="col-xl-4 col-lg-4 col-md-4 col-sm-4 col-4"
						style="margin-top: 1em">
						<div class="panel panel-info">
							<div class="panel-heading">
								<div>
									<h2 class="panel-title">Home page !</h2>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-xl-9 col-lg-9 col-md-9 col-sm-9 col-9"
						style="margin-top: 1em"> 
 						<p>The time on the server is ${serverTime}.</p>
						<p style="text-align: justify">Lorem ipsum dolor sit amet, ad usu putent dolorem, pro eu
							partiendo qualisque persecuti, solum qualisque ex eos. Ex has
							nulla utamur convenire, cu quo consul tamquam persequeris. Case
							ridens mei ad, dicta option philosophia te est, id dolorum
							inimicus cum. An vix stet vivendum salutatus. Delectus rationibus
							et ius. Pro ea nostrum delicata, eu assum erant delenit eam. Ad
							duo vide recteque, an nihil dolore noster his. Duo dolore maiorum
							appellantur ei, at quis soluta officiis usu. Habeo vivendum pro
							et, nec error lobortis no, an vel agam vivendo deserunt. Summo
							omnium appareat mel no, qui ea dicam quando soleat. Impedit
							praesent principes no vis.</p>
					</div>
				</div>
			</div>
		</div>

	</tiles:putAttribute>
</tiles:insertDefinition>