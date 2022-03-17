<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>mypage</title>
<style>
#Members {
	margin-left: 12%;
	margin-top: 5%;
	height: 200px;
	width: 1400px;
}

#membut {
	height: 200px;
	width: 300px;
}

#mil {
	margin-top: 5%;
	width: 1400px;
}

h5 {
	display: inline;
}
</style>

<link href="././resources/css/styles.css" rel="stylesheet" />
<link rel="stylesheet" href="../resource/css/main.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container px-4 px-lg-5">
			<a class="navbar-brand" href="#!">CAL</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="<%=request.getContextPath()%>">Home</a></li>
					<li class="nav-item"><a class="nav-link"
						href="<%=request.getContextPath()%>/healthInfo.do">건강계산기</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" id="navbarDropdown" href=""
						role="button" data-bs-toggle="dropdown" aria-expanded="false">상품</a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item"
								href="<%=request.getContextPath()%>/listProduct.do">모든상품</a></li>
							<li><a class="dropdown-item"
								href="<%=request.getContextPath()%>/selectListProduct.do?category=2">단백질프로틴</a></li>
							<li><a class="dropdown-item"
								href="<%=request.getContextPath()%>/selectListProduct.do?category=1">닭가슴살</a></li>
							<li><a class="dropdown-item"
								href="<%=request.getContextPath()%>/selectListProduct.do?category=3">도시락</a></li>
						</ul></li>
				</ul>

			</div>
			<div align="right">
				<form>
					<button class="btn btn-outline-dark" type="submit">
						<i class="bi-cart-fill me-1"></i> Cart <span
							class="badge bg-dark text-white ms-1 rounded-pill">0</span>
					</button>


					<button class="btn btn-outline-dark" type="submit">
						<a href="<%=request.getContextPath()%>/LoginPage.do">로그아웃</a>
					</button>
				</form>
			</div>
		</div>
	</nav>
	<!-- Header-->
	<header class="bg-dark py-5">
		<div class="container px-4 px-lg-5 my-5">
			<div class="text-center text-white">
				<h1 class="display-4 fw-bolder">칼로리를 부탁해</h1>
				<p class="lead fw-normal text-white-50 mb-0">With this shop
					hompeage template</p>
			</div>
		</div>
	</header>

	<strong><h4>
			MyPage
			</h5></strong>
	<div id="mil">

		<strong><h5 style="margin-left: 250px">Milege</h5></strong> <strong><h5
				style="margin-left: 470px">원</h5></strong> <strong><h5
				style="margin-left: 100px">Coupon</h5></strong>
		<button style="margin-left: 355px">조회</button>
		<hr width="1200px" style="border: solid 2px black;" align="right">
	</div>

	<div id="Members">
		<input id="membut" type="button" value="주문 목록"></input> <input
			id="membut" type="button" value="회원 정보변경" style="margin-left: 200px;"></input>
		<input id="membut" type="button" value="회원 탈퇴"
			style="margin-left: 200px;"></input>
	</div>
</body>
</html>