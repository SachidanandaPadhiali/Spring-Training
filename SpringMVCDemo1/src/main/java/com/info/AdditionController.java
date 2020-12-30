package com.info;

import javax.servlet.http.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
	{
		int num1 = Integer.parseInt(request.getParameter("val1"));

		int num2 = Integer.parseInt(request.getParameter("val2"));
		AddService obj = new AddService();
		int res = obj.addition(num1,num2);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",res);
		mv.setViewName("Success.jsp");
		
		return mv;
	}

}
