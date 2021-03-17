package com.Testng_Concept;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assert_Concept {

	@Test
	private void credentials() {
		String expected =null;
		//String expected ="jainul";
		String actual = "nourin";
		
Assert.assertNotEquals(actual, expected);
System.out.println("passed");
Assert.assertNotNull(actual);
	}
	
	
}
