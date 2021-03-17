package com.Testng_Concept;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert_Concept {
	@Test
	private void credentials() {
		String actual ="jainul";
		String expected ="nourin";
		
		SoftAssert soft =new SoftAssert();
		soft.assertEquals(actual, expected);
		
		
		

	}

}
