package com.javaex.ex04;

public class Employee extends User{
	
	//필드
	private int salary;

	//생성자
	public Employee(int salary) {
		super();
		this.salary = salary;
	}


	//메소드-gs
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//메소드-일반
	public void showInfo() {
		
	}
}