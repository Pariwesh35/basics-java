package com.basics;

class EmployeeCount {
	private int numOfEmployees = 0;

	public void setNoOfEmployees(int count) {
		if (count < 0) {
			throw new IllegalArgumentException("count cannot be negative");
		}
		numOfEmployees = count;
	}

	public int getNoOfEmployees() {
		return numOfEmployees;
	}
}

public class EncapsulationDemo {
	public static void main(String args[]) {
		EmployeeCount obj = new EmployeeCount();
		obj.setNoOfEmployees(-100);
		System.out.println(" The number of Employees are : " + obj.getNoOfEmployees());
	}
}