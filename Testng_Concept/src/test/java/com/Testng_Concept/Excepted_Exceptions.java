package com.Testng_Concept;

import org.testng.annotations.Test;
public class Excepted_Exceptions {
	
	@Test(expectedExceptions=StringIndexOutOfBoundsException.class)
	
	private void add() {
		String s ="greens";
		//System.out.println(a);
		System.out.println(s.charAt(8));
		

	}

}
