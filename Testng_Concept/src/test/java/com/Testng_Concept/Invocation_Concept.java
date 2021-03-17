package com.Testng_Concept;

import org.testng.annotations.Test;

public class Invocation_Concept {
	
	
	@Test
	private void booksearch() {
		
System.out.println("booksearch");
	}
	
	
	@Test(invocationCount=4)
	private void laptopsearch() {
		System.out.println("laptopsearch");

	}
	@Test
	private void mobilesearch() {
		
		System.out.println("mobilesearch");
	}
	
	@Test
	private void earphonesearch() {
	
		System.out.println("earphonesearch");
	}
	
	@Test
	private void babytoyssearch() {
		System.out.println("babytoyssearch");

	}

}
