package kr.co.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.model.UserManager;

public class DeleteAction implements Controller {
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("userid");
		
		int re = UserManager.instance().delete(userid); 
		ModelAndView modelAndView = new ModelAndView();
		if(re > 0) {
			modelAndView.setViewName("list.m2");			
		}else {
			modelAndView.setViewName("fail.html");
		}
		
		modelAndView.setRedirect(true);
		return modelAndView;
	}
		
}
