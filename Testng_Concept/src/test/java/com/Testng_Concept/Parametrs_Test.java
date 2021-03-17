package com.Testng_Concept;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parametrs_Test {
	@Test
	@Parameters({"username","password"})
	private void credential(@Optional("starc")String username,int password) {
		System.out.println("Username :"+username);
		System.out.println("Password :"+ password);

	}

}
