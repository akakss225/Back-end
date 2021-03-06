package com.saeyan.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;
import com.saeyan.dto.ReplyVO;

public class BoardViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/board/boardView.jsp";
		String num = null;
		// 글번호를 받음. 글 목록에서 글 제목을 클릭했을 때
		if(request.getParameter("num") != null) {
			num = request.getParameter("num");
		}
		// 댓글 등록 후 상세보기로 넘어갈 때
		// jsp 형태가 아닌 자바 구문으로 넘어오기 때문에 Attribute로 받는다.
		if(request.getAttribute("num") != null) {
			num = (String) request.getAttribute("num");
		}
		
		// 부모글 번호 지정
		int pNum  = Integer.parseInt(num);
		
		BoardDAO bDao = BoardDAO.getInstance();
		
		// 조회수 증가
		bDao.updateReadCount(num);
		
		BoardVO bVo = bDao.selectOneBoardByNum(num);
		
		request.setAttribute("board", bVo);
		
		List<ReplyVO> replyList = bDao.selectAllReply(pNum);
		request.setAttribute("replyList", replyList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		
		dispatcher.forward(request, response);
		
			
		
	}

	
}
