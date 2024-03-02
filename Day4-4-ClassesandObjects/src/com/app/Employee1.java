package com.app;

public class Employee1 {

	//Abstraction
	private int empNo;
	private String empName;
	private double salary;
	
	//Constructor
	public Employee1()
	{
		System.out.println("This is a constructor.....");
	}

	//Argument Constructor
	public Employee1(int empNo, String empName, double salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
}
