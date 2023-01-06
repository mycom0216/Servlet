package com.smhrd.dto;

public class MemberDTO {
	
	// 회원정보를 저장할 때 사용할 나만의 자료형
	// 1. field
	private String name;
	private int age;
	private String id;
	private String pw;
	public MemberDTO(String name, int age, String id, String pw) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	// 2. method	
	// ---> 생성자
	
	
	// ---> getter, setter 메소드 생성
	
	
	
	
}
