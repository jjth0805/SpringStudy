package com.sesoc.web5.dao;

import com.sesoc.web5.vo.MemberVO;

public interface MemberMapper {

	public void signup(MemberVO vo);
//	public MemberVO login(MemberVO vo);
	public int login(MemberVO vo);
}
