package com.uni.cart.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.uni.cart.model.vo.Cart;
import static com.uni.common.JDBCTemplate.*;
public class CartDao {
	
private Properties prop = new Properties();
	
	public CartDao() {
		
		String fileName = CartDao.class.getResource("/sql/cart/cart-query.properties").getPath();
		
		//System.out.println("fileName   " + fileName);
		
		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public ArrayList<Cart> CartList(Connection conn, String writer) {
		ArrayList<Cart> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectCartList");
		//System.out.println("DAO sql : " + sql);
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(writer));
			//System.out.println("Dao writer : " + writer);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				
				Cart c = new Cart(rset.getInt("PRODUCT_PRICE"),
								  rset.getInt("PRODUCT_AMOUNT"),
								  rset.getString("P_NAME"),
							  	  rset.getDate("D_DATE"));
				
				list.add(c);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		//System.out.println("Dao list : " + list);
		return list;
	}

}
