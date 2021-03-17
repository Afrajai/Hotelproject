package com.java;

public class Fibbonaci {

	public static void main(String[] args) {
		int a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		for(int i=2;i<=10;i++) 
		{
			int c  =a+b;
			System.out.println(c);
		a=b;
		b=c;
		}
		
		
		
		
	}
}
