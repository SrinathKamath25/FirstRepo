package com.excelon.app;

public class Test1 {

	public static void main(String[] args) {
	//Accept three digit number find sum of digits
		int num = 123;
		int digit1 = num % 10;
		int digit2 = (num / 10) % 10;
		int digit3 = num/100;
		int sum = digit1+digit2+digit3;
		System.out.println("Sum of digits: " + sum);
	//Accept five digit number find sum of first and last digit
		int num1=12345;
		int first =num1 %10;
		int last = (num1 / 10000) % 10;
		int sum1 = first+last;
		System.out.println("Sum of first and last:" + sum1 );
	//Accept three digit number find reverse number
		int num2=12345;
		int fst = num2 %10;
		int second = (num2 / 10) % 10;
		int third = (num2 / 100) % 10;
		int fourth = (num2/ 1000) % 10;
		int fifth = (num2/10000) % 10;
		System.out.println("Reverse :" +fst+second+third+fourth+fifth );
	 

	}

}
