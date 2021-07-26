package com.techleads.app;

public class TestImmutableMyUser {
	public static void main(String[] args) {
		Age age=new Age();
		age.setDay(25);
		age.setMonth(9);
		age.setYear(1995);
		
		
		MyUser user=new MyUser(1, "Madhav", age);
		age.setMonth(9);
		System.out.println(user);
		age.setMonth(5);
		System.out.println(user);
		
		System.out.println("================");
		MyUser user1=new MyUser(1, "Madhav", age);
		System.out.println(user1);
		user1.getAge().setMonth(9);
		System.out.println(user1);
	}

}
