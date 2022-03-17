<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<link href="././resources/css/styles2.css" rel="stylesheet" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet" />
<style>
	.date {
  	text-align: right;
   }
   
   * {
    margin: 0;
    padding: 0;
	}

	table {
	    border-collapse: collapse;
	    border-spacing: 0;
	}
	
	tbody {
    display: table-row-group;
    vertical-align: middle;
    border-color: inherit;
	}

  .contents-cart {
      position: relative;
    visibility: hidden;
    width: 1000px;
    border: 1px solid #e0e0e0;
    margin: 0 auto 70px;
    padding: 40px 39px;
    background: #fff;
    }
    
    .cart-title {
        clear: both;
    height: 45px;
    margin-bottom: 0;
    padding-bottom: 32px;
    font-size: 30px
    }
    
    
    .cartTable{
    width: 898px;
    border-top: 0;
    }
    
    #cartTable-sku td.cart-deal-item__image {
    padding-right: 15px;
	}
	
	#cartTable-sku td.product-box {
    padding-left: 0;
	}
	
    .cart-deal-item td:nth-child(2) {
    width: 80px;
    overflow: hidden;
	}

    colgroup{
    display: table-column-group;
    }
    
    table {
    border-collapse: collapse;
    border-spacing: 0;
    text-indent: initial;
	}
	
	body, input, textarea, select, button, table {
    font-family: sans-serif;
    font-size: 100%;
	}
	
	a, blockquote, body, button, dd, div, dl, dt, fieldset, form, h1, h2, h3, h4, h5, h6, input, li, ol, p, pre, select, span, td, textarea, th, ul {
    margin: 0;
    padding: 0;
    color: #111;
    font-family: Dotum,\\B3CB\C6C0,sans-serif;
	}
	
	.cartTable .head {
    border-top: 1px solid #ddd;
    border-bottom: 1px solid #ddd;
    background: #fafafa;
	}
	
	.cartTable .head th {
    background: #fafafa;
    text-align: center;
	}
	
	.cartTable th {
    height: 40px;
    font-size: 13px;
	}

	tr {
	    display: table-row;
	    vertical-align: inherit;
	    border-color: inherit;
	}
	
	.product-name-part {
    border-bottom: 1px solid #e2e5e7;
    padding-bottom: 5px;
    letter-spacing: -1px;
	}

	.cart-deal-item td.product-box {
	    padding: 10px 5px 10px 15px;
	    text-align: left;
	    vertical-align: top;
	    z-index: 100;
	}
	
	.cartTable td {
    border-bottom: 1px solid #ddd;
    line-height: 35px;
    text-align: center;
	}
	
	.option-price-part {
    float: right;
    font-size: 12px;
    line-height: 24px;
	}
	
	.cart-deal-item td.product-box {
    padding: 10px 5px 10px 15px;
    text-align: left;
    vertical-align: top;
    z-index: 100;
	}
	
	
	.cart-deal-item td:nth-child(3) {
    width: 0px;
    overflow: hidden;
	}
	
	.cart-deal-item td:nth-child(4) {
    width: 88px;
	}
	
	.cart-deal-item .unit-total-price {
    position: relative;
    line-height: normal;
    border-left: 1px solid #ddd;
    font-size: 12px;
    color: #888;
	}
	
	.cart-deal-item td {
    padding: 10px 0;
    z-index: 1;
	}
	
	.delivery-fee {
    border-left: 1px solid #ddd;
    font-size: 12px;
    color: #888;
	}
	
	.bundle-price-total td {
    position: relative;
    padding: 20px 35px 16px 0;
    background: #f7f7f7;
    font-size: 12px;
    line-height: 29px;
    text-align: right;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</style>
</head>
<body>
<jsp:include page = "../common/menu2.jsp"/>

<section id="contents-cart" class="contents-cart async-content" style="visibility: visible;">        
        <section class="cart-title">
        <i class="bi-cart-fill me-1"></i>   장바구니
        </section>
        
    <div id="cartContent" data-faraway="" data-rocket-freemessage="{&quot;rocketFreshFreeShippingRemaingAmount&quot;:&quot;0&quot;,&quot;rocketFreshShippingOverAmount&quot;:&quot;0&quot;,&quot;skuFreeShippingOverAmount&quot;:&quot;19800&quot;, &quot;skuFreeShippingRemaingAmount&quot;:&quot;19800&quot;, &quot;freshLack&quot;:false, &quot;rocketLack&quot;:false }">

    <div class="tabs-wrap">
	<div class="tabs">
		
	</div>
</div>
    
        <table class="cartTable" summary="장바구니 상품명, 제품가격, 선택한수량, 총결제비용 정보 및 결제 상품으로 선택,해제 및 수량변경, 삭제 기능 제공표">
            <caption class="none">장바구니</caption>
            <colgroup><col width="50"><col width="80"><col width="*"><col width="90"><col width="90"></colgroup>
            <thead>
            <tr class="head">
                
                <th scope="colgroup" id="th-product-box" colspan="2">상품정보</th>
                <th scope="col" id="th-unit-total-price">상품금액</th>
                <th scope="col" id="th-delivery-fee">배송비</th>
            </tr>
            </thead>
            
                

                

                
                

    



    <tbody id="cartTable-sku">
    
        
            <tr class="cart-deal-item " data-item-status="CHECKED" data-adult="false" data-bundle-id="18170189112" data-bundle-type="PRODUCT" data-app="" data-group-type="rocket">
                
                   
	                <td class="cart-deal-item__image ">
                        
                            <a href="//www.coupang.com/vp/products/6236874079?vendorItemId=80200404752" class="moveProduct">
                                <img src="//thumbnail7.coupangcdn.com/thumbnails/remote/120x120ex/image/rs_quotation_api/vyl6vcyk/1a6aa5d7f5e24e319d1b47a83987cfd3.jpg" width="78" height="78" class="product-img img" alt="앤나인 Hipods Mini 데일리 블루투스 이어폰" data-bundle-id="18170189112">
                            </a>
                        
                    </td>
                    <td class="product-box">
                        
                        <div class="product-name-part">
                            
                            <a href="//www.coupang.com/vp/products/6236874079?vendorItemId=80200404752" class="product-name moveProduct modify-color">앤나인 Hipods Mini 데일리 블루투스 이어폰, 화이트</a>
                            
                                
                            
                        </div>
                        
                            <div id="80200404752" data-dawn-only="false" class="option-item modify-float" data-quantity="1" data-vendor-id="A00010028" data-vi="80200404752" data-vip="" data-pid="6236874079" data-itemid="12565414376" data-bundle-id="18170189112">
                                <div class="option-item-info" data-restock-notification-state="false">
                                    <div class="option-name">
                                        <span class="option-item-name" style="display:none;">앤나인 Hipods Mini 데일리 블루투스 이어폰, 화이트</span>
                                   
                                    </div>
                                    
                                                 
                                        
                                            <div class="delivery-date rocket modify-padding" style="visibility: visible;">
                                                <span class="arrive-date" style="display: inline-block;">20일 도착 보장</span>

                                            </div>
                                        
                                    
                                    
                                </div>
                                <div class="option-price-part" data-sale-price="32740">
                                    
	
		<span class="unit-cost" data-sale-price="32740"><span class="sr-only">제품가격</span>32,740원</span>
		<span class="select-select">
			<select class="quantity-select" data-url="/memberCartItem/quantity/18170189112/" data-quantity="1" data-all="false" title="앤나인 Hipods Mini 데일리 블루투스 이어폰, 화이트 수량변경">
				
					
						<option value="1" selected="selected">1</option>
					
				
			</select>
		</span>
		<span class="select-text">
			<input type="text" class="quantity-text" title="앤나인 Hipods Mini 데일리 블루투스 이어폰, 화이트 수량변경" maxlength="4" value="1" data-url="/memberCartItem/quantity/18170189112/" data-all="false">
			<input type="button" class="quantity-chg none" value="수량변경">
		</span>
		<span class="unit-price-area"><span class="unit-price"><span class="sr-only">구매가격</span>32,740원</span></span>
	

                                    <a href="/memberCartItem/deleteItems?cartItemIds[]=18170189112&amp;itemStatus=CHECKED" data-url="/memberCartItem/deleteItems?cartItemIds[]=18170189112&amp;itemStatus=CHECKED" data-all="false" class="delete-option"><span class="sr-only">앤나인 Hipods Mini 데일리 블루투스 이어폰, 화이트 상품삭제</span></a>
                                    
                                        
                                    
                                </div>
                            </div>
                           
                    </td>
                    
                    <td class="unit-total-price">
	                    
	
		
			
				<div class="unit-total-sale-price">32,740원</div>
			
		
	


                        
	<img src="//img1a.coupangcdn.com/image/cmg/icon/ios/logo_rocket_large@3x.png" width="56" height="14" class="vendor-badge rocket" alt="로켓배송">
	<img src="//image8.coupangcdn.com/image/badges/falcon/v1/web/rocketwow-bi-16@2x.png" width="56" height="14" class="rocket-wow" alt="로켓배송">

                    </td>
                    
	                    <td class="delivery-fee" rowspan="1" headers="th-delivery-fee">
                            
                                <span class="delivery-fee__free">무료</span>
                            
                        </td>
                    
                
            </tr>
	        
        
        <tr class="special-gift-area" style="display: none;">
            
        </tr>
        <tr class="bundle-price-total">
            <td colspan="5">
                
                <span class="rocket-total-price-area">
					상품가격 <span class="total-product-price number">0</span>원 <span class="coupon-area">
                    
                    <span class="symbol symbol-plus"><span class="sr-only">더하기</span></span>
					배송비 <span id="rocket-delivery-charge" class="delivery-charge"><strong>무료</strong></span>
					<span class="symbol symbol-equal"><span class="sr-only">결과는</span></span>
					주문금액
                  
                    <span class="total-order-price number">0</span>원
                  
				</span>
            </span></td>
        </tr>
    
    </tbody>








            
        </table>
        
            <div class="order-table-foot">
                
                    <span class="all-select-product">
						<label>
							<input title="모든 상품을 결제상품으로 설정" type="checkbox" class="all-deal-select"> <span>전체선택</span><span class="cart-count-bottom">( <em>0</em> / 1 )</span>
						</label>
						<a href="javascript:void(0);" class="selected-delete logging" data-login="true" data-view-type="shoppingCart" data-event-name="selectiveDeletionClick" data-log-label="cart-p-deleteMulti" data-coulog-type="clickEvent" data-listener-event-type="click">선택삭제</a>
						<a href="javascript:void(0);" class="selected-soldout-delete logging" data-login="true" data-view-type="shoppingCart" data-event-name="deleteAllEosAndOosClick" data-log-label="cart-p-outDeleteAll" data-coulog-type="clickEvent">품절/판매종료상품 전체삭제</a>
					</span>
                
                <div class="payment-benefit"></div>
            </div>

            
            <div class="download-coupon-area" style="display: none;"></div>

            
                <div class="payment-reward-cash-area">
                    <img class="payment-reward-cash-area__icon" src="//img1a.coupangcdn.com/image/cart/generalCart/ico_cash_m_2x.png">
                    <h3 class="payment-reward-cash-area__title">캐시적립 혜택</h3>
                  
                    <span class="payment-reward-cash-area__desc">쿠페이 머니 결제 시 1% 적립</span>
                  
                    <span class="payment-reward-cash-area__desc">[로켓와우 + 쿠페이 계좌이체] 결제 시 2% 적립</span>
                  
                    <span class="payment-reward-cash-area__desc">[로켓와우 + 쿠페이 머니] 결제 시 4% 추가적립</span>
                  
                    
                      <a class="payment-reward-cash-area__btn" id="btnSignUpWowMember">로켓와우 무료체험 신청하기</a>
                    
                   
                </div>
            

            
            <div class="cart-total-price" data-total-price="0" data-discount-price="0">
                <div class="cart-total-price__inner">
                    <div class="price-area">
                        <h2 class="sr-only" id="cart-total-price">
                            장바구니 총 주문금액 정보
                        </h2>

                        총 상품가격
                        <em class="final-product-price">0</em>원
                        <span class="final-sale-area">
                        
                        </span>

                        <span class="symbol-plus1"><span class="sr-only">더하기</span></span>
                        총 배송비
                        <em class="final-delivery-charge">0</em>원
                        <span class="symbol-equal1"><span class="sr-only">결과는</span></span>
                        총 주문금액
                        <em class="final-order-price" data-final-order-price="0">
                          0원
                        </em>
                    </div>

                    <div id="ccidArea" class="ccid-area" style="display: none;">
                        <span class="ccid-amount">
                          카드 즉시할인 예상금액 (<em id="ccidAmount">0</em>원 할인)
                        </span>
                        <span class="adjustment-price" id="adjustmentPrice">
                          <em>0</em>원
                        </span>
                    </div>
                </div>

                
            </div>


            
            <div class="faraway-notice">
                <strong>도서산간 배송안내 </strong>
                : 도서산간 추가배송비 발생 시 함께 결제할 수 있습니다. <span class="faraway-address"></span><br>
                로켓배송은 추가배송비도 무료
            </div>

            
            <div class="order-buttons">
                <a id="continueShoopingBtn" class="goShopping logging" href="//www.coupang.com" data-view-type="shoppingCart" data-event-name="continuouslyShoppingClick" data-log-label="cart-p-continuouslyShoppingClick" data-coulog-type="clickEvent" data-listener-event-type="click">계속 쇼핑하기</a>
                <a href="javascript:void(0);" class="goPayment" id="btnPay" data-pay-url="/cart/orderV3?isAllChecked=false">구매하기</a>
                <div class="item-disabled" style="display: none;"></div>
            </div>
        
        
    
    <iframe id="ab_iframe" class="ab_test" src="" width="0" height="0" frameborder="0" vspace="0"></iframe>
    
</div>


    </section>
    <jsp:include page = "../common/footer.jsp"/>
</body>
</html>