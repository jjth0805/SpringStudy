package com.sesoc.web4;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesoc.web4.vo.TestVO;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "main";
	}
	@RequestMapping(value = "set", method = RequestMethod.GET)
	public String set() {
		return "set";
	}
	@RequestMapping(value = "if", method = RequestMethod.GET)
	public String exIf(Model model) {
		model.addAttribute("num1", 111);
		model.addAttribute("num2", 222);
		model.addAttribute("name1", "abc");
		model.addAttribute("name2", "abc");
		return "if";
	}
	@RequestMapping(value = "choose", method = RequestMethod.GET)
	public String choose(Model model) {
		model.addAttribute("num1", 111);
		model.addAttribute("num2", 222);
		return "choose";
	}
	@RequestMapping(value = "foreach", method = RequestMethod.GET)
	public String foreach(Model model) {
		ArrayList<TestVO> list = new ArrayList<>();
		list.add(new TestVO("userid1","pwd1"));
		list.add(new TestVO("userid2","pwd2"));
		list.add(new TestVO("userid3","pwd3"));
		list.add(new TestVO("userid4","pwd4"));
		list.add(new TestVO("userid5","pwd5"));
		
		model.addAttribute("list", list);
		return "foreach";
	}
	@RequestMapping(value = "fmt", method = RequestMethod.GET)
	public String fmt(Model model) {
		model.addAttribute("date","2020-01-20 10:41:55");
		return "fmt";
	}
}
