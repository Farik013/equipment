<!-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>

	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>

	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h2>
			Welcome : ${pageContext.request.userPrincipal.name} | <a
				href="javascript:formSubmit()"> Logout</a>
		</h2>
	</c:if>

</body>
</html> -->

<jsp:include page="header.jsp" />
<div class="row">
	<div class="col-lg-8">
		<!--Simple table example -->
		<div class="panel panel-primary">
			<div class="panel-heading">
				<i class="fa fa-bar-chart-o fa-fw"></i>Employee
			</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-12">
						<div class="table-responsive">
							<table class="table table-bordered table-hover table-striped">
								<thead>
									<tr>
										<th>#</th>
										<th>Date</th>
										<th>Time</th>
										<th>Amount</th>
										<th>Edit</th>
										<th>Delete</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>3326</td>
										<td>10/21/2013</td>
										<td>3:29 PM</td>
										<td>$321.33</td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td>3325</td>
										<td>10/21/2013</td>
										<td>3:20 PM</td>
										<td>$234.34</td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td>3324</td>
										<td>10/21/2013</td>
										<td>3:03 PM</td>
										<td>$724.17</td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td>3323</td>
										<td>10/21/2013</td>
										<td>3:00 PM</td>
										<td>$23.71</td>
										<td></td>
										<td></td>
									</tr>
									<tr>
										<td>3322</td>
										<td>10/21/2013</td>
										<td>2:49 PM</td>
										<td>$8345.23</td>
										<td></td>
										<td></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--End simple table example -->
		<jsp:include page="footer.jsp" />