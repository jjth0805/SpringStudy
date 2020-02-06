package com.sesoc.web3.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//기본생성자, 게터세터, 투스트링까지만 생성
//allargs는 초기화시켜주는 생성자 생성
public class TestVO {

	private String a;
	private String b;
}
