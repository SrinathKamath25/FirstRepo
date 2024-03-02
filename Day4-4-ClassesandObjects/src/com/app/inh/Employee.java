package com.app.inh;

public class Employee {
	

		//Abstraction
		public int empNo;
		public String empName;
		public double salary;
		
		//Constructor
		public Employee()
		{
			System.out.println("This is a constructor.....");
		}

		//Argument Constructor
		public Employee(int empNo, String empName, double salary) {
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


