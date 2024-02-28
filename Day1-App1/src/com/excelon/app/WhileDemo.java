package com.excelon.app;

public class WhileDemo {

	public static void main(String[] args) {
		int i=0,sum=0,evensum=0,oddsum=0;
		while (i<=10)
		{	
			if(i%2!=0)
      System.out.println("--------->"+i);
      sum=sum+i;
      i++;
      evensum=evensum+i;
      i++;
      oddsum=oddsum+i;
      i++;
	}
		System.out.println("--------->"+oddsum);
	}
	}
