package com.hcl.fullName;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FullNameController {
	@RequestMapping("/FullName")
	public ModelAndView calc(HttpServletRequest req,
			HttpServletResponse res) {
		String a = req.getParameter("firstName");
		String b = req.getParameter("secondName");
       String c = a + b;
        String result = "";
        result+=c;
        return new ModelAndView("result", "result", result);
}

}
