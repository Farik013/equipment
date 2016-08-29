<jsp:include page="header.jsp" />
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--  wrapper -->
<div id="wrapper">
	<div id="page-wrapper">
		<div class="row">
			<!-- Page Header -->
			<div class="col-lg-12">
				<h1 class="page-header">Inventory Soft</h1>
			</div>
			<!--End Page Header -->
		</div>
		<div class="row">
			<div class="col-lg-8">
				<form:form modelAttribute="allUsers"
					action="${pageContext.request.contextPath}/superAdmin" method="GET">
					<!--Simple table example -->
					<div class="panel panel-primary">
						<div class="panel-heading">
							<i class="fa fa-bar-chart-o fa-fw"></i>Employee
						</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-lg-12">
								<button type="button" class="btn btn-default">
											<a href="insertUser"><i class="fa fa-plus-square"
												aria-hidden="true"></i></a>
										</button>
									<div class="table-responsive">
										<table class="table table-bordered table-hover table-striped">
											<thead>
												<tr>
													<th>Login</th>
													<th>Name</th>
													<th>Surname</th>
													<th>Department</th>
													<th>Enabled</th>
													<th>Edit</th>
													<th>Delete</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach items="${allUsers}" var="au">
													<tr>
														<td>${au.username}</td>
														<td>${au.name}</td>
														<td>${au.surname}</td>
														<td>${au.department.name}</td>
														<c:choose>
															<c:when test="${au.enabled eq true }">
																<td>True</td>
															</c:when>
															<c:when test="${au.enabled ne true }">
																<td>False</td>
															</c:when>
														</c:choose>
														<td><button type="button" class="btn btn-default"
																aria-label="Left Align">
																<a href="updateUser/${au.username}"><i
																	class="fa fa-pencil" aria-hidden="true"></i></a>
															</button></td>
														<td><button type="button" class="btn btn-default"
																aria-label="Left Align">
																<i class="fa fa-trash-o" aria-hidden="true"></i>
															</button></td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
				</form:form>
				<!--End simple table example -->
				<jsp:include page="footer.jsp" />