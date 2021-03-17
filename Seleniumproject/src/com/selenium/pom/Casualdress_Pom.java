package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casualdress_Pom {
	public static WebDriver driver;

@FindBy(xpath="//div[@class='product-container']")
private WebElement cas_Img;

@FindBy(xpath="//span[text()='Quick view']")
private WebElement quickview_Btn;  

@FindBy(name="qty")
private WebElement qtyy;

@FindBy(name="group_1")
private WebElement size;

@FindBy(name="Orange")
private WebElement color;

@FindBy(name="Submit")
private WebElement addToCart;

@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
private WebElement click;

@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
private WebElement proceedout1;






public Casualdress_Pom(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getCas_Img() {
	return cas_Img;
}

public WebElement getQuickview_Btn() {
	return quickview_Btn;
}

public WebElement getQtyy() {
	return qtyy;
}

public WebElement getSize() {
	return size;
}

public WebElement getColor() {
	return color;
}

public WebElement getAddToCart() {
	return addToCart;
}
public WebElement getClick() {
	return click;
	
}
public WebElement getProceedout1() {
		return proceedout1;
	}

	

}































	













