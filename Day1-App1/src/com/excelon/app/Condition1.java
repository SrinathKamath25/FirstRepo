package com.excelon.app;

import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a value");
	int balance=s.nextInt();
	System.out.println("salary is " + balance);
	if(balance>100)
	{
		System.out.println("Eligible for travel");
	}
	else
	{
		System.out.println("Not eligible for travel");
	}
	}

}
//If salary is greater than 100$, eligible for travel, if less than $100 not eligible
