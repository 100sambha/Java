<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<%@include file="components/allcss.jsp"%>
<style type="text/css">
.point-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card point-card">
					<div class="card-body">
						<p class="fs-4 text-center">User Register</p>
						<c:if test="${not empty errMsg}">
							<p class="text-center text-danger fs-3">${errMsg}</p>
							<c:remove var="errMsg" />
						</c:if>
						<form action="user_register" method="post">
							<div class="mb-3">
								<label class="form-label">Full Name</label> <input
									name="fullname" type="text" class="form-control" />
							</div>
							<div class="mb-3">
								<label class="form-label">Email</label> <input name="email"
									type="email" class="form-control" />
							</div>
							<div class="mb-3">
								<label class="form-label">Password</label> <input
									name="password" type="password" class="form-control" />
							</div>
							<button type="submit" class="btn bg-success text-white col-md-12">Register</button>
							<div class="pt-2">
								If account already exist click here to <a href="user_page.jsp"
									class="text-decoration-none">log in</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>