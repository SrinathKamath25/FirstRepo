//Sum of Digits
package com.excelon.app;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int sum = 0;
		for (; n!=0; n/=10) {
			sum += n%10;
			
		}
		System.out.println("Sum of digits:"+ sum);
	}
}

