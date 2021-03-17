package com.Testng_Concept;

import org.testng.Assert;
import org.testng.annotations.Test;


public class My_Test {
	@Test(retryAnalyzer= Retry_Analyzer.class)
	private void credentials() {
		String actual ="jainul";
		String expected ="nourin";
		Assert.assertEquals(actual,expected);
		

	}

	
	@Test(retryAnalyzer= Retry_Analyzer.class)
	private void credentials1() {
		String actual ="jainul";
		String expected ="nourin";
		Assert.assertEquals(actual,expected);
		

	}

	
}
