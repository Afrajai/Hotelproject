package com.Testng_Concept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@BeforeSuite
	
	private void setproperty() {
		System.out.println("setproperty");

	}
	
	
	@BeforeTest
	private void browserlaunch() {
		System.out.println("browserlaunch");

	}
	
@BeforeClass
	
	private void urlpass() {
		System.out.println("url pass");

	}
	
@BeforeMethod
	
	private void login() {
		System.out.println("login");

	}
	
	

@Ignore
@Test
	private void laptopSerach() {
		
System.out.println("laptop search");
	}
	
	
@Test(enabled = false)
	private void earPhone() {
	System.out.println("ear phone");

	}
	
	@Test
	private void booksearch() {
		System.out.println("book search");

	}
	
	@Test
	private void mobilesearch() {
		System.out.println("mobile search");

	}
	
	
	
	@AfterMethod
	private void logout() {
		System.out.println("logout");

	}
	
	@AfterClass
	private void homepage() {
		System.out.println("homepage");

	}
	@AfterTest
	private void close() {
		System.out.println("close");

	}
	@AfterSuite
	private void deletecookies() {
		System.out.println("delete cookies");

	}
	
}
