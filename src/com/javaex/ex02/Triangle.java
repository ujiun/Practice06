package com.javaex.ex02;

public class Triangle extends Shape{
	//필드
	private int width; 
	private int heigh;
	
	//생성자
	public Triangle() {
		System.out.println("생성자 Triange(0) 실행");
	}

	public Triangle(int width, int heigh) {
		super("검정", "검정");
		this.width = width;
		this.heigh = heigh;
		System.out.println("생성자 Triange(2) 실행");
	}
	
	public Triangle(String fillColor, String LineColor, int width, int heigh) {
		super(fillColor, LineColor);
		this.width = width;
		this.heigh = heigh;
		System.out.println("생성자 Triange(2) 실행");
	}
	
}


