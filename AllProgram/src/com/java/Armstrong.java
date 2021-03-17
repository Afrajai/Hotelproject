package com.java;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		
		int a,i=0,j=0;
		a=n;
		
		while(a>0)
		{
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
			
		}
		if(n==j)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armstrong number");
		}
		
	}

	
	
}
