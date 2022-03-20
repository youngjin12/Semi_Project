package com.uni.notice.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.uni.common.model.vo.PageInfo;
import com.uni.notice.model.service.NoticeService;
import com.uni.notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeListServlet
 */
@WebServlet("/noticeList.do")
public class NoticeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 전체 리스트 뿐만 아니라 페이지도 고려해서 가져와야 함

		// 페이징 처리
		int listCount; // 총 게시글 개수
		int currentPage; // 현재 페이지
		int startPage; // 시작 페이지
		int endPage; // 끝 페이지
		int maxPage; // 전체 페이지의 가장 마지막 페이지
		
		int pageLimit; // 한 페이지 하단에 보여질 패이지의 최대 개수
		int boardLimit; // 한 페이지에 보여질 게시글의 최대 개수
		
		// 총 개시글 개수 가져와서 담기
		listCount = new NoticeService().getListCount();
		
		// 현재 페이지
		currentPage = 1;
		
		// 페이지 전환 시 전달 받은 페이지가 있을 경우
		// 전달 받은 페이지를 currentPage 에 담기
		if(request.getParameter("currentPage") != null) {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		
		// 패이지의 최대 개수
		pageLimit = 10;
		
		// 게시글의 최대 개수
		boardLimit = 10;
		
		// 총 페이지 수 (게시글 총 개수 / 한 페이지 담길 개수 > 올림값)
		// int > double > int
		maxPage = (int)Math.ceil((double)listCount/boardLimit);
		
		// 페이징의 시작 수
		startPage = (currentPage - 1) / pageLimit * pageLimit + 1;
		
		// 페이징의 마지막 수
		endPage = startPage + pageLimit - 1;
		
		// 단, 예를 들어 maxPage 가 13 인 경우 endPage 도 13
		// 전체 페이지의 마지막 수보다 페이징의 마지막 수가 더 크면 해당 수로 전체 페이지 수 바뀜
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		
		// 페이지 관련 정보들 PageInfo 객체에 담기
		PageInfo pi = new PageInfo(listCount, currentPage, startPage, endPage, maxPage, pageLimit, boardLimit);
		
		
		// ============================
		// 공지사항 전체를 조회하기 위해 ArrayList 사용
		// 조회해서 가져 온 결과 list에 담기
		ArrayList<Notice> list = new NoticeService().selectList(pi);
		
		// list jsp로 보내기
		request.setAttribute("list", list);
		request.setAttribute("pi", pi);
		
		// 화면 전환 > 게시판 목록으로
		request.getRequestDispatcher("views/notice/noticeListView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
