package com.basics;

public class InterfaceDemo {
	public static void main(String[] args) {
		Person doctor;// = new Doctor();
//		doctor.work();
		doctor = new Engineer();
		doctor.work();
	}
}

interface Person1 {
	public abstract void work(); // abstract method

	public void sleep();
}

class Doctor1 implements Person1 {

	@Override
	public void work() {
		System.out.println("treat people");
	}
	@Override
	public void sleep() {
	}
}

class Engineer1 implements Person1 {// child

	@Override
	public void work() {
		System.out.println("solve real life problems. ");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}
}