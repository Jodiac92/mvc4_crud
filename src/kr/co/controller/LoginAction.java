package kr.co.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction implements Controller{
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String id = request.getParameter("userid");
		String pwd = request.getParameter("password");
		System.out.println(id + " " + pwd);
		//모델과 통신
		
		ModelAndView modelAndView = new ModelAndView();
		//modelAndView.setViewName("list.m2"); 
		return modelAndView; // ->UserServlet의 controller = new LoginAction();
	}
}
