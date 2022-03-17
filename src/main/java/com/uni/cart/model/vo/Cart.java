package com.uni.cart.model.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Cart {

	private int cartNo;
	private int userNo;
	private int pAmount;
	private int pPrice;
	private int pId;
	private String pName;
	private String pInfo;
	private Date dDate;
	public final static int dPrice = 2500;
	
	
	
	// insertCart에 쓰일 생성자
	public Cart(int cartNo, int userNo, int pAmount, int pPrice, int pId) {
		super();
		this.cartNo = cartNo;
		this.userNo = userNo;
		this.pAmount = pAmount;
		this.pPrice = pPrice;
		this.pId = pId;
	}
	
	// selectCart에 쓰일 생성자
	public Cart(int pPrice, int pAmount, String pName, Date dDate) {
		super();
		this.pPrice = pPrice;
		this.pAmount = pAmount;
		this.pName = pName;
		this.dDate = dDate;
		
	}
	
}
