package com.sesoc.web3;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesoc.web3.vo.TestVO;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "main";
	}
	@RequestMapping(value = "sessionTest1", method = RequestMethod.GET)
	public String sessionTest1(HttpSession session) {
		session.setAttribute("username", "홍길동");
		session.setAttribute("vo", new TestVO("aaa","bbb"));
		return "main";
	}
	@RequestMapping(value = "sessionTest2", method = RequestMethod.GET)
	public String sessionTest2(HttpSession session) {
		String username = (String)session.getAttribute("username");
		TestVO vo = (TestVO)session.getAttribute("vo");
//		오브젝트타입 저장 문자열 키값 모두
		System.out.println(username);
		System.out.println(vo);
		return "main";
	}
	@RequestMapping(value = "sessionTest3", method = RequestMethod.GET)
	public String sessionTest3(HttpSession session) {
		session.removeAttribute("username");
		return "main";
	}
	@RequestMapping(value = "sessionTest4", method = RequestMethod.GET)
	public String sessionTest4(HttpSession session) {
		session.invalidate();
		return "main";
//		로그아웃기능을 구현할때
	}
	@RequestMapping(value = "cookieTest1", method = RequestMethod.GET)
	public String cookieTest1(HttpServletResponse response) {
		Cookie c1 = new Cookie("username", "홍길동");
		Cookie c2 = new Cookie("userid", "testid");
		
		c1.setMaxAge(1*60*60*24); //초단위로 쿠키시간 하루동안 유효하겐
		c2.setMaxAge(-1);//브라우저를 닫았을때 쿠키를 삭제한다
		// 수명을 지정하지 않으면 기본으로 -1이 저장된다
		
//		한개의 쿠키객체에 하나의 쿠키데이터를 저장할 수 있음
//		쿠키는 value값을 문자열만 저장 가능함
		response.addCookie(c1);
		response.addCookie(c2);
		
		return "main";
	}
	@RequestMapping(value = "cookieTest2", method = RequestMethod.GET)
	public String cookieTest2(HttpServletRequest request) {
		Cookie[] arr = request.getCookies();
		for( Cookie c : arr) {
			System.out.printf("Name : %s, Value : %s\n", c.getName(),c.getValue());
		}
		return "main";
//		클라이언트로 부터 전달 받은 쿠키들을 배열로 가져옴 
	}
}
