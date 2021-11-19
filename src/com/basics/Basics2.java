package com.basics;

public class Basics2 {
	public static void main(String[] args) {
		A1 a1 = new A1();
//		a1.name = "Ajay";
		System.out.println(a1.hashCode());
		System.out.println(a1); //age=20, name=Ajay
	}
}

class A1 {// Object
	String name;//custom
	float age;//primitive
//	@Override
//	public String toString() {
//		return "name= "+ this.name + ",age= "+ this.age ;
//	}
}