package com.uni.cart.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.uni.cart.model.service.CartService;
import com.uni.cart.model.vo.Cart;
import com.uni.member.model.vo.Member;

/**
 * Servlet implementation class ProductPaymentServlet
 */
@WebServlet("/orderProductList.do")
public class CartProductPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartProductPaymentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String writer = String.valueOf(((Member)request.getSession().getAttribute("loginUser")).getUserNo());

		ArrayList<Cart> list = new CartService().CartList(writer);
		Member m = new CartService().MemberInfo(writer);

		//System.out.println("Servlet m : " + m);
	
		
		request.setAttribute("list", list);
		request.setAttribute("m", m);

		request.getRequestDispatcher("views/cart/orderList.jsp").forward(request, response);
		
		response.setContentType("application/json; charset=utf-8"); 
		
		
		
		new Gson().toJson(list, response.getWriter());
		new Gson().toJson(m, response.getWriter());
		//System.out.println("Servley list : " + list);
		
		System.out.println("Servley list : " + list);
		
		
		//int q = Integer.parseInt(request.getParameter("q"));
		//System.out.println("Servlet q : " + q);
		//System.out.println(d.dPrice);
		//System.out.println("servlet c.getPPrice : " + c.getPPrice());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
