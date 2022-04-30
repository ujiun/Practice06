package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] Array = new User[3];
		
		User c01 = new Customer("jws","j1234","정우성",1000);
		User c02 = new Customer("yjs","y2345","이효리",2000);
		User e01 = new Employee("master","m7788","운영자",5000000);
		
		Array[0] = c01;
		Array[1] = c02;
		Array[2] = e01;
		
		for(int i=0; i<Array.length; i++) {
			Array[i].showInfo();
		}
		
		System.out.println("운영자의 월급은" + ((Employee)Array[2]).getSalary() + "원 입니다.");
	}

}
