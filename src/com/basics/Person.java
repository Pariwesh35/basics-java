package com.basics;

public abstract class Person {
	public abstract void work(); // abstract method

	public void sleep() { // concrete method
		System.out.println("sleeping");
	}
}

class Doctor extends Person{

	@Override
	public void work() {
		System.out.println("treat people");
	}
}
class Engineer extends Person{//child

	@Override
	public void work() {
		System.out.println("solve real life problems. ");
	}
}