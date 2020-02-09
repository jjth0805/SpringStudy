package com.sesoc.web5.dao;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sesoc.web5.vo.MemberVO;
//어노테이션 쓰면 컨테이너에 등록됨 
@Repository
public class MemberDAO {
//붙여줘야지 컨테이너에서 찾아서 데려와서 사용할수 있음
	@Autowired
	private SqlSession sqlSession;
	
	public void signup(MemberVO vo) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		
		try {
			mapper.signup(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int login(MemberVO vo, HttpSession session) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
//		MemberVO temp = null;
		int temp=0;
		try {
			temp = mapper.login(vo);
			if(temp!=0) session.setAttribute("userid",vo.getUserid());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	public void logout(HttpSession session) {
		session.removeAttribute("userid");
	}
}
