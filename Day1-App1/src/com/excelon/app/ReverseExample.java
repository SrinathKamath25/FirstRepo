package com.excelon.app;

import java.util.Scanner;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=s.nextInt(),r,rn=0;
		while(n>0)
		{
			r=n%10;
			rn=rn*10+r;
			n=n/10;
		}
		System.out.println("Reverse number is"+rn);
	}

}
