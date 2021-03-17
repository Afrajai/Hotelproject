package com.Testng_Concept;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyzer implements IRetryAnalyzer {
	int count=0, limit=5;

	public boolean retry(ITestResult result) {
	if(count<limit)
	{
		count++;
		return true;
	}
		return false;
	}
	
	
	

}
