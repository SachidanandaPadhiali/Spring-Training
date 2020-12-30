package com.info;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("user") String user, @RequestParam("pass") String pass)
	{
		LoginServlce login = new LoginServlce();
		String msg = login.validate(user, pass);
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",user);
		if(msg.equals("valid"))
		{
			mv.setViewName("Success");
		}
		else
		{
			mv.setViewName("Error");

		}
		
		return mv;
	}

}
