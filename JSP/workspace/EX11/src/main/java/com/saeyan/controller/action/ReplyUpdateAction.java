package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.ReplyVO;

public class ReplyUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReplyVO rVo = new ReplyVO();
		
		rVo.setNo(Integer.parseInt(request.getParameter("num")));
		rVo.setName(request.getParameter("name"));
		rVo.setPassword(request.getParameter("pass"));
		rVo.setContent(request.getParameter("content"));
		
		
		BoardDAO bDao = BoardDAO.getInstance();
		bDao.updateReply(rVo);
		
		new BoardListAction().execute(request, response);
		
	}
	

}
