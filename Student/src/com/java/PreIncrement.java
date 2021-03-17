package com.java;

public class PreIncrement {
public static void main(String[] args) {
	int a =5; 
	System.out.println(a++);              //6
	System.out.println(a);              //6
	System.out.println(++a);            //7
	System.out.println(++a);            //8
	System.out.println(a);               //8
	System.out.println(a++);              //9
	System.out.println(a++);              //10
	System.out.println(++a + a++);        // 11+11 =22
	
	
}
}
