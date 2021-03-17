package com.java;

import java.util.Scanner;

public class Reversenumber {
	public static void main(String[] args) {
		Scanner rn = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = rn.nextInt();
		
		int a, i=0,j=0;
		a=n;
		while(a>0)
		{
		i=a%10;
		j=(j*10)+i;
		a=a/10;
		}
	
		System.out.println("reverse number is =" + j);
		
		if(n==j)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
}
}

