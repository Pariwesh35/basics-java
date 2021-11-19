package com.basics;

public class WrapperDemo {
	public static void main(String[] args) {
		int a =1;//primitive
		System.out.println(a);
		Integer b = new Integer(1);// object
		System.out.println(b.doubleValue());
		
		double d1 = Double.parseDouble("2.3");
		Double objRef = d1; //auto boxing
		Double d2 = new Double(2.4);
		double d3 = d2;//auto unboxing
		System.out.println(d2);
//		boolean b1 =(boolean) 1;
	}
}