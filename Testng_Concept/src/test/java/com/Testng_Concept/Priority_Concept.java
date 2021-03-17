package com.Testng_Concept;

import org.testng.annotations.Test;

public class Priority_Concept {
	
	@Test
	private void booksearch() {
		
System.out.println("booksearch");
	}
	
	
	@Test(priority=1)
	private void laptopsearch() {
		System.out.println("laptopsearch");

	}
	@Test(priority=-1)
	private void mobilesearch() {
		
		System.out.println("mobilesearch");
	}
	
	@Test(priority=0)
	private void earphonesearch() {
	
		System.out.println("earphonesearch");
	}
	
	@Test
	private void babytoyssearch() {
		System.out.println("babytoyssearch");

	}

}
