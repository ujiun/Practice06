package com.javaex.ex04;

public class Customer extends User{
	
	//필드
	private int point;

	//생성자
	public Customer(int point) {
		super();
		this.point = point;
	}

	//메소드-gs
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}	
	
	//메소드-일반
	public void showInfo() {
		
	}

}
