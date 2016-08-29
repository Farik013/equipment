<jsp:include page="header.jsp" />
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--  wrapper -->
<div id="wrapper">
	<div id="page-wrapper">
		<div class="row">
			<!-- Page Header -->
			<div class="col-lg-12">
				<h1 class="page-header">Update User</h1>
			</div>
			<!--End Page Header -->
		</div>
		<div class="row">
			<div class="col-lg-8">
				<form:form modelAttribute="newUser"
					action="${pageContext.request.contextPath}/insertUser"
					method="POST">
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
											<tr>
												<td>Username:</td>
												<td>Password:</td>
												<td>Name:</td>
												<td>Surname:</td>
												<td>Enabled:</td>
												<td>Department:</td>
											</tr>
											<tr>
												<td><form:input path="username" /></td>
												<td><form:input path="password"/></td>
												<td><form:input path="name" /></td>
												<td><form:input path="surname" /></td>
												<td><form:input path="enabled" /></td>
												<td><form:input path="department.name" /></td>
												<form:hidden path="department.adress"/>
												<form:hidden path="department.id"/>
												
											</tr>
										</table>
										<input type="submit" value="Insert" name="btnInsert" />
									</div>
								</div>
							</div>
						</div>
					</div>
				</form:form>
				<!--End simple table example -->
				<jsp:include page="footer.jsp" />