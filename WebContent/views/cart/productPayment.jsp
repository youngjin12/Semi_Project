<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="com.uni.cart.model.vo.Cart" %>
<%
	Cart cd = new Cart();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="https://service.iamport.kr/js/iamport.payment-1.1.5.js"></script>
</head>
<body>
	<jsp:include page = "../common/menu.jsp"/>
	<table>
		<tr>
			<td> ${c.getPPrice() }</td>
		</tr>
		<tr>
			<td> ${m.getUserName() }</td>
		</tr>
		<tr>
			<td>
				    <p>아임 서포트 결제 모듈 테스트 해보기</p>
				    <button id="check_module" type="button">아임 서포트 결제 모듈 테스트 해보기</button>
			</td>
		</tr>
		<tr>
			<td><a id="continueShoopingBtn" class="goShopping logging" href=<%=request.getContextPath()%>>계속 쇼핑하기</a></td>
		</tr>
	</table>
	
	<jsp:include page = "../common/footer.jsp"/>
	
	<script>
	
		$("#check_module").click(function () {
			
			var IMP = window.IMP; // 생략가능
			
			IMP.init('imp70634783');
				// 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용
				// i'mport 관리자 페이지 -> 내정보 -> 가맹점식별코드
				
			IMP.request_pay({
				
					pg: 'inicis', // version 1.1.0부터 지원.
						/*
							'kakao':카카오페이,
							html5_inicis':이니시스(웹표준결제)
							'nice':나이스페이
							'jtnet':제이티넷
							'uplus':LG유플러스
							'danal':다날
							'payco':페이코
							'syrup':시럽페이
							'paypal':페이팔
						*/
					pay_method: 'card',
						/*
							'samsung':삼성페이,
							'card':신용카드,
							'trans':실시간계좌이체,
							'vbank':가상계좌,
							'phone':휴대폰소액결제
						*/
					merchant_uid: new Date().getTime(),
						/*
							merchant_uid에 경우
							https://docs.iamport.kr/implementation/payment
							위에 url에 따라가시면 넣을 수 있는 방법이 있습니다.
							참고하세요.
							나중에 포스팅 해볼게요.
						*/
						
					name: '주문명:결제테스트',
					//결제창에서 보여질 이름
					
					amount: ${c.getPPrice()},
					//가격
					
					buyer_email: 'iamport@siot.do',
					buyer_name: '구매자이름',
					buyer_tel: '010-1234-5678',
					buyer_addr: '서울특별시 강남구 삼성동',
					buyer_postcode: '123-456',
				
				}, function (rsp) {
					
				location.href= "<%=request.getContextPath()%>/paymentResult.do?rsp="+rsp;
				
					console.log(rsp);
					if (rsp.success) {
						
						
						console.log(rsp.name)
				} else {
				var msg = '결제에 실패하였습니다.';
				msg += '에러내용 : ' + rsp.error_msg;
				}
			alert(msg);
			});
		});
</script>

</body>
</html>