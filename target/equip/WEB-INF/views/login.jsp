<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<title>Login Page</title>
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}
</style>
<link href="<c:url value="resources/plugins/bootstrap/bootstrap.css" />"
	rel="stylesheet" />
<link
	href="<c:url value="resources/font-awesome/css/font-awesome.css" />"
	rel="stylesheet" />
<link
	href="<c:url value="resources/plugins/pace/pace-theme-big-counter.css" />"
	rel="stylesheet" />
<link href="<c:url value="resources/css/style.css" />" rel=stylesheet />
<link href="<c:url value="resources/css/main-style.css" />"
	rel=stylesheet />
</head>
<body class="body-Login-back">
	<c:if test="${not empty error}">
		<div class="error">${error}</div>
	</c:if>
	<c:if test="${not empty msg}">
		<div class="msg">${msg}</div>
	</c:if>
	<div class="container">
		<div class="row">
			<div class="col-md-4 col-md-offset-4 text-center logo-margin ">
				<img src="<c:url value="resources/img/logo.png"/>" alt="" />
			</div>
			<div class="col-md-4 col-md-offset-4">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Please Sign In</h3>
					</div>

					<div class="panel-body">
						<form name='loginForm'
							action="<c:url value='/j_spring_security_check' />" method='POST'>
							<fieldset>
								<div class="form-group">
									<input class="form-control" placeholder="Username"
										name="username" type="text" autofocus>
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="Password"
										name="password" type="password" value="">
								</div>
								<div class="checkbox">
									<label> <input name="remember" type="checkbox"
										value="Remember Me">Remember Me
									</label>
								</div>
								<!-- Change this to a button or input when using this as a form -->
								<input name="submit" class="btn btn-lg btn-success btn-block"
									type="submit" value="Login" />
							</fieldset>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Core Scripts - Include with every page -->
	<script src="<c:url value="resources/plugins/jquery-1.10.2.js"/>"></script>
	<script
		src="<c:url value="resources/plugins/bootstrap/bootstrap.min.js"/>"></script>
	<script
		src="<c:url value="resources/plugins/metisMenu/jquery.metisMenu.js"/>"></script>
</body>

</html>