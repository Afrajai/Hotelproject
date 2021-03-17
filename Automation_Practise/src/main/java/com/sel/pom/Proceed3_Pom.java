package com.sel.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed3_Pom {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
	
	private WebElement proceed3;

	public Proceed3_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceed3() {
		return proceed3;
	}
	

}
//*[@id="center_column"]/form/p/button/span