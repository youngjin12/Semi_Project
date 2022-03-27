<%@page import="com.uni.order.model.vo.Order"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
	ArrayList<Order> list = (ArrayList<Order>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page = "../common/menu.jsp"/>

	<div>
		<br><br><br><br><br><br><br><br><br><br><br>
		<%if (!list.isEmpty()){ %>
			<%for(Order o : list){%>
				<div>
				<%=o.getPId()%>
				<%=o.getDeliveryRequest() %>
				<%=o.getOrderDate()%>
				<%=o.getOrderNo()%>
				</div>
		
			<% }%>
		<%} %>
		
	</div>
		
	<jsp:include page = "../common/footer.jsp"/>
</body>
</html>