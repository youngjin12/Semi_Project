package com.uni.cart.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import com.uni.cart.model.dao.CartDao;
import com.uni.cart.model.vo.Cart;

import static com.uni.common.JDBCTemplate.*;

public class CartService {

	public ArrayList<Cart> CartList(String writer) {
		Connection conn = getConnection();
		
		ArrayList<Cart> list = new CartDao().CartList(conn, writer);
		
		close(conn);
		
		return list;

	}

}
