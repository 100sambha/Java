<%@page import="com.db.DbConnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<%@include file="components/allcss.jsp"%>
<style type="text/css">
.point-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	
<%-- 	<% Connection conn=DbConnect.getConnection();out.print(conn);%> --%>
	
	<div id="carouselExample" class="carousel slide">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="./img/hos1.jpeg" class="d-block" alt="..." width="100%"
					height="500px">
			</div>
			<div class="carousel-item">
				<img src="./img/hos2.jpeg" class="d-block" alt="..." width="100%"
					height="500px">
			</div>
			<div class="carousel-item">
				<img src="./img/hos3.jpeg" class="d-block" alt="..." width="100%"
					height="500px">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExample" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExample" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	<div class="container p-3">
		<p class="text-center fs-2">Key Features Of Hospital Management
			System</p>
		<div class="row">
			<div class="col-md-8 p-5">
				<div class="row">
					<div class="col-md-6">
						<div class="card point-card">
							<div class="card-body">
								<p class="fs-5">100% Safety</p>
								<p>God always with me, So today is my day, So I can do it
									and, So I am the best, So I am always winner</p>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="card point-card">
							<div class="card-body">
								<p class="fs-5">100% Safety</p>
								<p>God always with me, So today is my day, So I can do it
									and, So I am the best, So I am always winner</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card point-card">
							<div class="card-body">
								<p class="fs-5">100% Safety</p>
								<p>God always with me, So today is my day, So I can do it
									and, So I am the best, So I am always winner</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card point-card">
							<div class="card-body">
								<p class="fs-5">100% Safety</p>
								<p>God always with me, So today is my day, So I can do it
									and, So I am the best, So I am always winner</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<img alt="doctor starnge" src="./img/doctor.jpg" height="100%"
					width="100%">
			</div>
		</div>
	</div>
	<hr />
	<div class="container p-2">
		<p class="text-center fs-2">Our Team</p>
		<div class="row">
			<div class="col-md-3">
				<div class="card point-card">
					<div class="card-body text-center">
						<img alt="doctor starnge" src="./img/doctor.jpg" height="230px"
							width="270px">
						<p class="fs-5 fw-bold">100% Safety</p>
						<p class="fs-7">God</p>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card point-card">
					<div class="card-body text-center">
						<img alt="doctor starnge" src="./img/doctor.jpg" height="230px"
							width="270px">
						<p class="fs-5 fw-bold">100% Safety</p>
						<p class="fs-7">God</p>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card point-card">
					<div class="card-body text-center">
						<img alt="doctor starnge" src="./img/doctor.jpg" height="230px"
							width="270px">
						<p class="fs-5 fw-bold">100% Safety</p>
						<p class="fs-7">God</p>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card point-card">
					<div class="card-body text-center">
						<img alt="doctor starnge" src="./img/doctor.jpg" height="230px"
							width="270px">
						<p class="fs-5 fw-bold">100% Safety</p>
						<p class="fs-7">God</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="./components/footer.jsp" %>
</body>
</html>