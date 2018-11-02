package com.graingreat.customer.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.graingreat.common.controller.Controller;
import com.graingreat.common.controller.ModelAndView;
import com.graingreat.common.factory.XMLObjectFactory;
import com.graingreat.service.BoardService;
import com.graingreat.service.BoardServiceImpl;
import com.graingreat.service.CustomerService;
import com.graingreat.service.CustomerServiceImpl;

/**
 * /user/list.mall에 대한 요청 처리 컨트롤러
 * @author 김기정
 *
 */
public class CustomerFindmeController implements Controller {
	
	CustomerService customerService;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		ModelAndView mav = new ModelAndView();
		
		XMLObjectFactory factory = (XMLObjectFactory)request.getServletContext().getAttribute("objectFactory");
		customerService = (CustomerService)factory.getBean(CustomerServiceImpl.class);
		
		mav.setView("/customer/findme.jsp");
		
		return mav;
	}

}
