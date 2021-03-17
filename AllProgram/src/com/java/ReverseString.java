package com.java;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		String original,reverse ="";
		
		Scanner rs = new Scanner(System.in);
		
		System.out.println("enter a string ");
	
		 original = rs.nextLine();

		
		int length = original.length();
		for(int i=length-1; i>=0; i--)
		
			reverse =  reverse + original.charAt(i);
		System.out.println("reverse of entered string is :"+ reverse);
	
		if(original.equals(reverse))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	
		}
	
	

}
