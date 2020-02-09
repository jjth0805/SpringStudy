package com.sesoc.web5.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesoc.web5.dao.MemberDAO;
import com.sesoc.web5.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDAO dao;
	
	@RequestMapping(value = "member/signupForm", method = RequestMethod.GET)
	public String signupForm() {
		
		return "member/signupForm";
	}
	@RequestMapping(value = "member/signup", method = RequestMethod.POST)
	public String signup(MemberVO vo) {
		// DB에 vo 값을 지정하는 로직을 수행하는 메서드를 호출
		dao.signup(vo);
		return "main";
	}
	@RequestMapping(value = "member/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		
		return "member/loginForm";
	}
	@RequestMapping(value = "member/login", method = RequestMethod.POST)
	public String login(MemberVO vo, HttpSession session) {
		int temp=dao.login(vo, session);
		if(temp==0) return "member/loginForm"; 
		return "main";
	}
	@RequestMapping(value = "member/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		dao.logout(session);
		return "main";
	}
}
