package com.Testng_Concept;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider ="test_Data")
	private void credentials(String username, int password)
	{
		
System.out.println("Username :"+username);
System.out.println("Password :"+password);
	}
	
	@DataProvider
	private Object[][] test_Data() {
		return new Object[][] {
			
			{"smith" ,123},
			{"starc" ,456},
			{"watson",567}
		};
	}

}
