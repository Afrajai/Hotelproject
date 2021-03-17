package com.sel.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed4_Pom {
	public static WebDriver driver;
	
	@FindBy(name="cgv")
	private WebElement checkbox;
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
	private WebElement proceed4;

	

	
	public Proceed4_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getProceed4() {
		return proceed4;
	}


}
//*[@id="center_column"]/form/p/button/span
//*[@id="form"]/p/button/span