package com.xpath;

public class DefaultConstructorTest {

	String studentName = "Raja";
	int rollNo = 0123;

	public static void main(String[] args) {
		
		DefaultConstructorTest a = new DefaultConstructorTest();
		String studentName2 = a.studentName;
		System.out.println(studentName2);
		
		
		DefaultConstructorTest a1 = new DefaultConstructorTest();
		String studentName3 = a.studentName;
		System.out.println(studentName3);
		
		
		
		
	}
}
