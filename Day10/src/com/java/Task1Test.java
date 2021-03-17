package com.java;

public class Task1Test {
	
	public static void main(String[] args) {
		int a=4;
		
		try {
			
			
			System.out.println(a/0);
		} catch (Exception e) {
			try {
				System.out.println(a);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
		
}
