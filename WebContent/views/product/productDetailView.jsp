<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.Date.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>상품 상세페이지</title>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<link href="././resources/css/styles2.css" rel="stylesheet"/>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.1/moment.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.1/locale/ko.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/dayjs/1.10.7/dayjs.min.js"></script>
<style>
	.date {
  	text-align: right;
  }
	#wrap #box{ 
	    width:50%;
	    height:300px;
	    position:absolute;
	    left:50%;
	    margin-left:-150px;
	    margin-bottom:-150px;
	}
</style>
</head>
<body style=background:#f8f8f8>
 	<jsp:include page = "../common/menu.jsp"/>
    <!-- Product section-->
    <section class="py-5">
        <div class="container px-4 px-lg-5 my-5">
            <div class="row gx-4 gx-lg-5 align-items-center">
                <div class="col-md-6"><img class="card-img-top mb-5 mb-md-0" src="<%=request.getContextPath() %>/resources/image/${p.piName}" alt="상품이미지" /></div>
                <div class="col-md-6">
                
                 <input type="hidden" id="io" value="${io.pnum}">
     			 <form id="orderStart" action="<%=request.getContextPath()%>/productDetailPayment.do" method="post">
                
                    <input type="hidden" name="pId" value="${p.pId}">
                	
                    <div class="small mb-1">
                    	<c:if test= "${fn:contains(p.pName, '프로틴')}">
                    	<h4>프로틴파우더</h4>
                    	</c:if>
                    	<c:if test= "${fn:contains(p.pName, '닭가슴살') && not fn:contains(p.pName, '볶음')}">
                    	<h4>닭가슴살</h4>
                    	</c:if>
                    	<c:if test= "${fn:contains(p.pName, '볶음밥')}">
                    	<h4>도시락</h4>
                    	</c:if>
                    </div>
                    
                    <input type="hidden" name="pName" value="${p.pName}">
                    <h1 id="title" class="display-5 fw-bolder">${p.pName}</h1>
                    <div class="fs-5 mb-5">
                       <input type="hidden" id ="changePrice" name="pPrice" value="${p.pPrice}">
                       ₩<span id="price" >${p.pPrice}</span>원
                    </div>
                    
                    <c:if test= "${fn:contains(p.pName, '임팩트')}">
                    	<p class="lead">건강하게 기른 소의 원유를 건조, 필터, 분말화의 세분화된 공정을 통하여 제조한 유청 단백질입니다.
						독립 리뷰 단체인 랩도어로 부터 품질 및 가치 부문 A등급을 받은 우수한 품질의 임팩트 프로틴을 지금 바로 경험해 보세요.</p>
                    </c:if>
                    <c:if test= "${fn:contains(p.pName, '다이어트')}">
                    	<p class="lead">단백질을 증가시키기 위해 특별히 개발된 유청 단백질 파우더입니다. 
                    	단백질에서 자연적으로 발생하는 글루타민이 추가되어 새로운 근육을 만들고 복구하는 데 도움을 줍니다</p>
                    </c:if>
                    <c:if test= "${fn:contains(p.pName, '식물성')}">
                    	<p class="lead">완두콩과 잠두콩 단백질을 혼합하여 식물성 파우더 식단을 한층 강화합니다. 
                    	낮은 당 함유량과 더불어 훌륭한 맛을 자랑합니다.</p>
                    </c:if>
                    <c:if test= "${fn:contains(p.pName, '가슴살') && not fn:contains(p.pName, '볶음')}">
                    	<p class="lead">국내산 순 닭가슴살 96.62% 함유! 순 닭가슴살로 맛을 꽉채워 입안 가득 담백함이 일품입니다.
                    	고유의 맛과 부드러움은 더욱살리면서 은은한 맛을 더해 짜지 않고 맛있는 닭가슴살을 완성했습니다. </p>
                    </c:if>
                    <c:if test= "${fn:contains(p.pName, '볶음') && not fn:contains(p.pName, '곤약')}">
                    	<p class="lead">200도 고온 볶음솥에서 볶아 밥알이 고슬고슬 하고 은은한 불맛이 납니다
                    	비법소스와 레시피로 만들어 깊은 풍미와 감칠맛을 느낄 수 있습니다.
                    	단백질이 풍부한 국내산 닭가슴살을 넣어 맛과 식감을 살렸습니다.</p>
                    </c:if>
                    <c:if test= "${fn:contains(p.pName, '곤약')}">
                    	<p class="lead">쌀밥으로만 구성 된 일반 볶음밥과는 달리 낮은 칼로리, 풍부한 식이섬유를 자랑하는 곤약미를 더해
                    	쌀의 부족한 영양을 보충해주고 신선한 재료들을 듬뿍 담아 맛과 식감을 살렸어요.
                    	가볍고 든든하게, 맛있는 한끼 식사를 하고 싶다면 지금 선택하세요.</p>
                    </c:if>

                    
                    <div class="btn-group" role="group" aria-label="Basic radio toggle button group">
                    	<c:if test= "${fn:contains(p.pName, '프로틴')}">
						  <input type="radio" class="btn-check" name="btnradio" id="btnradio1" value="500" autocomplete="off"  checked>
						  <label class="btn btn-outline-dark" for="btnradio1">500g</label>
						  <input type="radio" class="btn-check" name="btnradio" id="btnradio2" value="1000" autocomplete="off" >
						  <label class="btn btn-outline-dark" for="btnradio2">1kg</label>
						  <input type="radio" class="btn-check" name="btnradio" id="btnradio3" value="2000" autocomplete="off" >
						  <label class="btn btn-outline-dark" for="btnradio3">2kg</label>
						</c:if>
						<c:if test= "${not fn:contains(p.pName, '프로틴')}">
						  <input type="radio" class="btn-check" name="btnradio" id="btnradio" value="200" autocomplete="off"  checked>
						  <label class="btn btn-outline-dark" for="btnradio1">200g</label>
						</c:if>
					</div>
					
					<div><br></div>
                    <div class="d-flex">
    					<button type="button" class="btn btn-secondary" id="minus">-</button>
                        <input id="numBox" name="numBox" type="num" style="max-width: 3rem" value="1" readonly/>
                        <button type="button" class="btn btn-secondary" id="plus">+</button>
                    </div>
                    
                    <div><br></div>
                    <div>
                        <button class="btn btn-outline-success" type="button" id="cart">
                            <i class="bi-cart-fill me-1"></i>
                            장바구니담기
                        </button>
                        <button type="submit" class="btn btn-outline-primary" id="submit"> 주문하기 </button>
                        <br>
                        <label id = "userCheck"></label>
                    </div>
                    <input type="hidden" name="pId" value="">
                 </form>
                 
                </div>
            </div>
        </div>
    </section>
    <script>
    	
    	$(function(){
    		
    		console.log(${userNo})
    		if(${userNo} == 0) {
    			$("#submit").hide();
    			$("#cart").hide();
    			$("#userCheck").text("비회원은 주문불가합니다").css("color", "red");
    		} 
    		 
    	})
    	
	    $('.btn-check').click(function(){ // 그램수변경할때마다 가격변경

			let q = $('input[name="btnradio"]:checked').val(); // 포장용량
			let name = $('#title').html(); // 제품이름
			
			$.ajax({
				
				url: "changeProduct.do",
				
				type: "get",
				
				data:{
					q:q,
					name:name
				},
				
				success:function(object){
					console.log(object)
					// 상품이 변할때마다 가격, 재고량, 주문량 변경
					$('#price').text(object.price);
					$('#changePrice').val(object.price);
					$("#io").val(object.count);
					$("#numBox").val(1);
				},
				
				error:function(){
   		   			console.log("ajax통신실패");
   		   		}
	
				
			})
			
		})
		
    	$("#plus").click(function(){
    		
    	   let num = $("#numBox").val();
    	   let plusNum = Number(num) + 1;
    	   let count = $("#io").val();
			
    	   // 재고량보다 많이 선택하는 경우 더이상 증가불가, 알람띄우기
    	   if(plusNum > count) {
    	    	$(".numBox").val(num);
    	    	alert("재고량이 부족합니다. 더 이상 주문할 수 없습니다")
    	   } else {
    	    	$("#numBox").val(plusNum);          
    	   }
    	   
    
   	  	 });
     	  
	    
   	    $("#minus").click(function(){
    	  
   	       let num = $("#numBox").val();
    	   let minusNum = Number(num) - 1;
    	   
    	   if(minusNum == 0) {
    		   $("#numBox").val(minusNum+1);          
    	   } else {
    		  $("#numBox").val(minusNum);    
    	   }
    	 
    	   
			
   	     });

    </script>
    
     <script>
    $('#cart').click(function(){
    	
    	let pId = $('[name="pId"]').val();
    	let pPrice = $('#changePrice').val();
    	let amount = $('#numBox').val();
    	
    	//console.log(pId)
    	//console.log(pPrice)
    	//console.log(amount)
    	
    	$.ajax({
    		
    		url:"productInCart.do",
    		
    		data : {
    			
    			pId:pId,
    			pPrice:pPrice,
    			amount:amount
    			
    		},
    		success:function(){
    			
    			let result = confirm("장바구니에 성공적으로 담았습니다! 장바구니로 이동하시겟습니까?");
    			if(result){
    				location.href="<%=request.getContextPath()%>/cartList.do";
    			}
 
    		}
    		
    	})<%-- ajax 끝--%>
    	
    })
    
    </script>
    
    <section class="py-5 bg-light">
        <div class="container px-4 px-lg-4 mt-4">
			<table class="table table-striped">
			 <h2 class="fw-bolder mb-4">상세 정보</h2>
		
			 <thead>
			 	<tr>
			 		<th>영양정보</th>
			 		<th>100g당</th>
			 	</tr>
			 </thead>
			 <tbody>
			   <tr>
			      <th>칼로리</th>
			      <td>${p.pKacl}kcal</td>
			   </tr>
			   <tr>
			      <th>탄수화물</th>
			      <td>${p.pCarbo}g</td>
			   </tr>
			   <tr>
			      <th>단백질</th>
			      <td>${p.pProtin}g</td>
			   </tr>
			   <tr>
			      <th>지방</th>
			      <td>${p.pFat}g</td>
			   </tr>
			   <tr>
			      <th>나트륨</th>
			      <td>${p.pNatrium}g</td>
			   </tr>
			 </tbody> 
			</table>
        </div>
     </section>
     
     <section class="py-5 bg-light">
     	<div class="container px-4 px-lg-4 mt-4">
     		<h2 class="fw-bolder mb-4">상품 후기</h2>
     	</div>
        <div class="container px-4 px-lg-4 mt-4" id="list">
			<!-- 후기 내역 -->
			
        </div>
    </section>
    
    <script>
    	
    	let pId = ${p.pId};
    
    	$(function(){
    		
			$.ajax({
				
				url: "selcetReviewList.do",
				
				type: "post",
				
				data:{
					pId: pId
				},
				
				success:function(list){
					
					let value = "";
					
					// 후기 없을때
					if(list.length == 0 ) {
   		   				
						value += '<div class="container px-4 px-lg-4 mt-4" id="wrap">'+
					   				'<div class="container px-4 px-lg-4 mt-4" id="box">'+
									'<h4 class="fw-bolder mb-4">등록된 후기가 없습니다</h4>'+
									'</div><br><br>'+
								'</div>'
   		   				
   		   			}
					// 후기 있을때		
   		   			for(var i in list){
   		   				
   		   				let month = list[i].rUpdate.substring(0,2);
   		   				let day = list[i].rUpdate.substring(3,5);
   		   				let year = list[i].rUpdate.slice(-4,11);
   		   				let update = year+"년 "+month+" "+day+"일";
   		   				
						value += '<table class="table table-striped">'+
						 			'<thead>'+
									 	'<tr>'+
									 		'<th>'+list[i].rName+'</th>'+
									 		'<th class="date">'+update+'</th>'+
									 	'</tr>'+
									 '</thead>'+
									 '<tbody>'+
									  '<tr>'+
									      '<th colspan="2">'+list[i].rContent+'</th>'+  
									   '</tr>'+
									 '</tbody>'+
			 					 '</table>';
		                  
					}
   		   			
							
					$("#list").html(value);
				},
				
				error:function(e){
   		   			
					console.log(e)

   		   		}

			})

    	})

    </script> 
     
    <jsp:include page = "../common/footer.jsp"/>
</body>
</html>