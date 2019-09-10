package com.hcl.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping ("/Hello")
	public ModelAndView helloWorld() {
		return new ModelAndView("result", "message","welcome to spring MVC Programming");
	}
	

}
