package com.uni.cart.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.uni.cart.model.dao.CartDao;
import com.uni.cart.model.vo.Cart;

import static com.uni.common.JDBCTemplate.*;

public class CartService {
/*
	public ArrayList<Cart> CartList(String writer) {
		Connection conn = getConnection();
		
		ArrayList<Cart> list = new CartDao().CartList(conn, writer);
		//System.out.println("Service list ============" + list);
		close(conn);
		
		return list;

	}
	
	*/
	public Cart CartList(String writer) {
		Connection conn = getConnection();
		
		Cart c = new CartDao().CartList(conn, writer);
		System.out.println("service c : " + c);
		//System.out.println("Service list ============" + list);
		close(conn);
		
		return c;

	}

}
