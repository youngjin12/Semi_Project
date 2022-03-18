<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.uni.member.model.vo.Member"%>
<%
Member loginUser = (Member) session.getAttribute("loginUser");
String contextPath = request.getContextPath();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Shop Homepage - Start Bootstrap Template</title>
<!-- Core theme CSS (includes Bootstrap)-->
<link href="././resources/css/styles.css" rel="stylesheet" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<!-- Navigation-->
   	<nav class="navbar navbar-expand-lg navbar-light bg-light">
       	<div class="container px-4 px-lg-5">
           	<a class="navbar-brand" href="#!">CAL</a>
           	<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
           	<div class="collapse navbar-collapse" id="navbarSupportedContent">
               	<ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                   	<li class="nav-item"><a class="nav-link active" aria-current="page" href="<%=request.getContextPath() %>">Home</a></li>
                   	<li class="nav-item"><a class="nav-link" href="<%=request.getContextPath() %>/healthInfo.do">건강계산기</a>
                   	</li>
                   	<li class="nav-item dropdown">
                       	<a class="nav-link dropdown-toggle" id="navbarDropdown" href="" role="button" data-bs-toggle="dropdown" aria-expanded="false">상품</a>
                       	<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                       	   	<li><a class="dropdown-item" href="<%=request.getContextPath() %>/productlistForm.do">모든상품</a></li>
                           	<li><a class="dropdown-item" href="<%=request.getContextPath() %>/selectProductListForm.do?category=2">단백질프로틴</a></li>
                           	<li><a class="dropdown-item" href="<%=request.getContextPath() %>/selectProductListForm.do?category=1">닭가슴살</a></li>
                           	<li><a class="dropdown-item" href="<%=request.getContextPath() %>/selectProductListForm.do?category=3">도시락</a></li>
                       	</ul>
                   	</li>
   	                   	<li class="nav-item"><a class="nav-link" href="<%=request.getContextPath() %>/noticeList.do">공지사항</a>
	                   	<li class="nav-item"><a class="nav-link" href="<%=request.getContextPath() %>/boardList.do">Q&A</a>
                   	</li>
               </ul>
				<form class="d-flex">
					<button class="btn btn-outline-dark" type="submit">
						<i class="bi-cart-fill me-1"></i> 
						<a href="<%=request.getContextPath()%>/cartList.do">Cart <span
							class="badge bg-dark text-white ms-1 rounded-pill">0</span>
					</button>

					<% if (loginUser == null) { %>

						<button class="btn btn-outline-dark" type="submit">
							<a href="<%=request.getContextPath()%>/LoginPage.do">로그인</a>
						</button>
				
						
					<% } else { %>
	
					<% if (loginUser != null && loginUser.getUserId().equals("admin")) { %>
	
						<div class="btns" align="center">
							<a href="<%=request.getContextPath()%>/managerPage.do">관리자페이지</a>
							<a href="<%=request.getContextPath()%>/logoutMember.do">로그아웃</a>
						</div>
	
					<% } else { %>
	
						<div id="userInfo">
							<b style="color: blue;"><%=loginUser.getUserName()%> 님 </b> 어서오세요.
							<br>
							<br>
							<div class="btns" align="center">
								<a href="<%=request.getContextPath()%>/mypageMember.do">마이페이지</a>
								<a href="<%=request.getContextPath()%>/logoutMember.do">로그아웃</a>
							</div>
						</div>
						
						<%}%>
					<%}%>
					
				</form>
			</div>

		</div>
	</nav>


</body>
</html>