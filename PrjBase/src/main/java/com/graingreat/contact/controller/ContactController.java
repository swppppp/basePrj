package com.graingreat.contact.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.graingreat.common.controller.Controller;
import com.graingreat.common.controller.ModelAndView;
import com.graingreat.common.factory.XMLObjectFactory;
import com.graingreat.service.CartService;
import com.graingreat.service.CartServiceImpl;

/**
 * 게시판에 대한 요청 처리 컨트롤러
 * @author 전상일
 *
 */
public class ContactController implements Controller {
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		ModelAndView mav = new ModelAndView();
		
		XMLObjectFactory factory = (XMLObjectFactory)request.getServletContext().getAttribute("objectFactory");
		
		mav.setView("contact.jsp");
		
		return mav;
	}
}
