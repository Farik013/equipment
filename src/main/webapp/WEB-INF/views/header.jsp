<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page session="true"%>
<html>
<head>
<title>Super Admin</title>
<link href="<c:url value="/resources/plugins/bootstrap/bootstrap.css" />"
	rel="stylesheet" />
<link
	href="<c:url value="/resources/font-awesome/css/font-awesome.css" />"
	rel="stylesheet" />
<link
	href="<c:url value="/resources/plugins/pace/pace-theme-big-counter.css" />"
	rel="stylesheet" />
<link href="<c:url value="/resources/css/style.css" />" rel=stylesheet />
<link href="<c:url value="/resources/css/main-style.css" />"
	rel=stylesheet />
<!-- Page-Level CSS -->
<link
	href="<c:url value="/resources/plugins/morris/morris-0.4.3.min.css"/>"
	rel="stylesheet" />
</head>
<body>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>
	<!-- Welcome -->
	<div class="main">
		<div class="hello">
			<div class="alert alert-info">
				<b><c:url value="/j_spring_security_logout" var="logoutUrl" />
					<form action="${logoutUrl}" method="post" id="logoutForm">
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</form> <script>
						function formSubmit() {
							document.getElementById("logoutForm").submit();
						}
					</script> <i class="fa fa-folder-open"></i></b>Welcome Back,
				<c:if test="${pageContext.request.userPrincipal.name != null}">
					
						${pageContext.request.userPrincipal.name} | <a
						href="javascript:formSubmit()"> <i
						class="fa fa-sign-out fa-fw"></i>Logout
					</a>

				</c:if>
				</b>
			</div>
		</div>
		<!--end  Welcome -->