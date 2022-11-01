<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container my-5">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/add-konsumen">Add Konsumen</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>List of Konsumen's</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Nama</th>
            <th>Alamat</th>
            <th>Kota</th>
            <th>Provinsi</th>
            <th>Tgl Registrasi</th>
            <th>Status</th>
						<th width="20%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${konsumen}" var="konsumen">
						<tr>
							<td>${konsumen.nama}</td>
							<td>${konsumen.alamat}</td>
							<td>${konsumen.kota}</td>
							<td>${konsumen.provinsi}</td>
							<td><fmt:formatDate value="${konsumen.tgl_registrasi}"
                pattern="dd/MM/yyyy" /></td>
              <td>${konsumen.status}</td>
              <td>
                <a type="button" class="btn btn-success"
                  href="/update-konsumen?id=${konsumen.id}">Update</a>
							  <a type="button" class="btn btn-warning"
								href="/delete-konsumen?id=${konsumen.id}">Delete</a>
              </td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jspf"%>