package com.hcl.name;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NameListController {
	@RequestMapping("/Name")
	public ModelAndView nameDemo () {
		List<String> lstNames = new ArrayList<String>();
		lstNames.add("Priya");
		lstNames.add("Sobha");
		lstNames.add("Hyma");
		lstNames.add("Sudhakar");
		lstNames.add("Arfiya");
		return new ModelAndView("ShowPage", "lists", lstNames);

	}

}
