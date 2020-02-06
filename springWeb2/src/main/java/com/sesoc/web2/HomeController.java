package com.sesoc.web2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesoc.web2.vo.TestVO;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "main";
	}
	@RequestMapping(value = "send1", method = RequestMethod.GET)
	public String send1(String a, int b) {
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		return "main";
	}
	@RequestMapping(value = "send2", method = RequestMethod.GET)
	public String send2(String a, String b) {
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		return "main";
	}
	@RequestMapping(value = "send3", method = RequestMethod.GET)
	public String send3(TestVO vo) {
		System.out.println(vo.getA());
		System.out.println(vo.getB());
		return "main";
	}
	@RequestMapping(value = "send4", method = RequestMethod.POST)
	public String send4(TestVO vo) {
		System.out.println(vo.getA());
		System.out.println(vo.getB());
		return "main";
	}
	@RequestMapping(value = "send5", method = RequestMethod.POST)
	public String send5(String a, String b) {
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		return "main";
	}
	@RequestMapping(value = "send6", method = RequestMethod.GET)
	public String send6(TestVO vo) {
		System.out.println(vo.getA());
		System.out.println(vo.getB());
		return "main";
	}
}
