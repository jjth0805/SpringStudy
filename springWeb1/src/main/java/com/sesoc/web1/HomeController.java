package com.sesoc.web1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "joinForm";

	}
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(String custid, String custpwd1, Model model) {
		System.out.println(custid);
		System.out.println(custpwd1);
		
		model.addAttribute("custid", custid);
		model.addAttribute("custpwd", custpwd1);
		
		return "joinCheck";

	}
	
}
