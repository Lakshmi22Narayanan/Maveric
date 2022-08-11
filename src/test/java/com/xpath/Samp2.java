package com.xpath;

public class Samp2 {
String s;
static int d;

public Samp2() {
	s = "Java";
	System.out.println("Programming Language = "+s);
}


Samp2(int dob) {
	d = dob;

	
}
	public static void main(String[] args) {
		Samp2 samp2 = new Samp2();
	
		Samp2 birt = new Samp2(1994);
		System.out.println("My DOB = "+d);
		
	}

}
