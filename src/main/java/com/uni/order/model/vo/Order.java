package com.uni.order.model.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Order {
	
	private int orderNo;
	private int userNo;
	private int cartNo;
	private int orderTOTAmount;
	private int orderTOTPrice;
	private Date orderDate;
	private String deliveryRequest;
	private int pId;
	private int pPrice;
	private int pAmount;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public Order(int orderNo, int userNo, int cartN, int totP, int totA, String dRequest) {
		super();
		this.orderNo = orderNo;
		this.userNo = userNo;
		this.cartNo = cartN;
		this.orderTOTAmount = totA;
		this.orderTOTPrice = totP;
		this.deliveryRequest = dRequest;
	}

	//insertOrder
	public Order(int orderNo, int userNo, int cartNo, int orderTOTAmount, int orderTOTPrice, Date orderDate,
			String deliveryRequest) {
		super();
		this.orderNo = orderNo;
		this.userNo = userNo;
		this.cartNo = cartNo;
		this.orderTOTAmount = orderTOTAmount;
		this.orderTOTPrice = orderTOTPrice;
		this.deliveryRequest = deliveryRequest;
	}

	//selectOrder
	public Order(int orderNo, int userNo, Date orderDate, String deliveryRequest, int pId, int pPrice, int pAmount) {
		super();
		this.orderNo = orderNo;
		this.userNo = userNo;
		this.orderDate = orderDate;
		this.deliveryRequest = deliveryRequest;
		this.pId = pId;
		this.pPrice = pPrice;
		this.pAmount = pAmount;
	}
	
	
	
	
}
