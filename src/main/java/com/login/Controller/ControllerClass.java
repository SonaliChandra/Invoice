package com.login.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {
	
	@RequestMapping("/show")
	public ModelAndView showInvoice(ModelAndView mv)
	{
		mv.setViewName("index");
		return mv;
	}

}
