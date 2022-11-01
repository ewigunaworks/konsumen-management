<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container my-5">
	<div class="panel panel-primary text-center">
		<div class="panel-heading text-uppercase font-weight-bold">Home Page</div>
		<div class="panel-body text-uppercase">
			Welcome ${name}
      <br/><a href="/list-konsumen">Click here</a> to manage konsumen data.
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>