package org.java;

public class ReverseString {
	public static void reverseOfWord()
	{String s ="Hello";
	String reverse = " ";
	for(int i=s.length()-1;i>=0;i--)
	{
		reverse = reverse +s.charAt(i);
		
	}
		System.out.println("reverse of word=" +reverse);
	}
public static void main(String[] args) {
	reverseOfWord();
}
}
