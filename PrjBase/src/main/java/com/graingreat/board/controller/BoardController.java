package com.graingreat.board.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.graingreat.common.controller.Controller;
import com.graingreat.common.controller.ModelAndView;
import com.graingreat.common.factory.XMLObjectFactory;
import com.graingreat.service.BoardService;
import com.graingreat.service.BoardServiceImpl;

/**
 * 게시판에 대한 요청 처리 컨트롤러
 * @author 전상일
 *
 */
public class BoardController implements Controller {
	
	private BoardService boardService;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		ModelAndView mav = new ModelAndView();
		
		XMLObjectFactory factory = (XMLObjectFactory)request.getServletContext().getAttribute("objectFactory");
		boardService = (BoardService)factory.getBean(BoardServiceImpl.class);
		
		mav.setView("board.jsp");
		
		return mav;
	}
}
