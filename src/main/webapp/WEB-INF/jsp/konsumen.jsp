<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container my-5">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Add Konsumen</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="konsumen">
						<form:hidden path="id" />
						<fieldset class="form-group">
							<form:label path="nama">Nama</form:label>
							<form:input path="nama" type="text" class="form-control"
								required="required" />
							<form:errors path="nama" cssClass="text-warning" />
						</fieldset>
            <fieldset class="form-group">
							<form:label path="alamat">Alamat</form:label>
							<form:input path="alamat" type="text" class="form-control"
								required="required" />
							<form:errors path="alamat" cssClass="text-warning" />
						</fieldset>
            <fieldset class="form-group">
							<form:label path="kota">Kota</form:label>
							<form:input path="kota" type="text" class="form-control"
								required="required" />
							<form:errors path="kota" cssClass="text-warning" />
						</fieldset>
            <fieldset class="form-group">
							<form:label path="provinsi">Provinsi</form:label>
							<form:input path="provinsi" type="text" class="form-control"
								required="required" />
							<form:errors path="provinsi" cssClass="text-warning" />
						</fieldset>
            
						<fieldset class="form-group">
              <form:label path="tgl_registrasi">Target Date</form:label>
							<form:input path="tgl_registrasi" type="text" class="form-control"
              required="required" />
							<form:errors path="tgl_registrasi" cssClass="text-warning" />
						</fieldset>
            
            <fieldset class="form-group">
              <form:label path="status">Status</form:label>
              <select path="status" class="custom-select">
                <form:option selected>Select Status</form:option>
                <form:option value="T">Active</form:option>
                <form:option value="F">Inactive</form:option>
              </select>
              <form:errors path="status" cssClass="text-warning" />
            </fieldset>
						<button type="submit" class="btn btn-success">Save</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>