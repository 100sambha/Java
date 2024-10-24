<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="header"%>
<%@ attribute name="content" fragment="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:100,200,300,400,500,600,700,800,900"
	rel="stylesheet">
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles//fontawesome.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles//templatemo-grad-school.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles//owl.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/styles/lightbox.css">
</head>
<body>
	<header class="main-header clearfix" role="header">
		<div class="logo">
			<a href="#"><em>DBI</em> Bank</a>
		</div>
		<a href="#menu" class="menu-link"><i class="fa fa-bars"></i></a>
		<nav id="menu" class="main-nav" role="navigation">
			<ul class="main-menu">
				<!-- <li><a href="login">Login</a></li> -->
				<li><a href="/" class="external">Logout</a></li>
			</ul>
		</nav>
		<nav>
			<ul>
				<li><a class="active" href="#home">Home</a></li>
				<li><a href="#news">News</a></li>
				<li><a href="#contact">Contact</a></li>
				<li><a href="#about">About</a></li>
			</ul>

		</nav>
	</header>

	<section class="section main-banner" id="top" data-section="section1">
		<video autoplay muted loop id="bg-video">
			<source src="assets/images/course-video.mp4" type="video/mp4" />
		</video>

		<div class="video-overlay header-text">
			<div class="caption">
				<h6>Indias Best Bank</h6>
				<h2>
					<em>Your</em> Bank
				</h2>
				<div class="main-button">
					<div class="scroll-to-section">
						<a href="#">Discover more</a>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
