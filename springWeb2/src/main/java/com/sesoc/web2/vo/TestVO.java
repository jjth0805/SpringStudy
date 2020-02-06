package com.sesoc.web2.vo;

public class TestVO {

	private String a;
	private String b;
	public TestVO() {
	}
	public TestVO(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "TestVO [a=" + a + ", b=" + b + "]";
	}	
}
