package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sec_Tshirtpom {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement tshirt;
	
	@FindBy(xpath="//div[@class='product-image-container']")
	private WebElement t_img;
	
	@FindBy(xpath="//span[text()='Quick view']")
	private WebElement quickview_Btnn;  
	
	@FindBy(name="qty")
	private WebElement qtyy;

	
	@FindBy(name="group_1")
	private WebElement sizee;
	
	@FindBy(name="Blue")
	private WebElement colorr;
	
	@FindBy(name="Submit")
	private WebElement addToCartt;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	private WebElement clickk;
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	private WebElement proceedout11;

	

	public Sec_Tshirtpom(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getTshirt() {
		return tshirt;
	}
	
	

	public WebElement getT_img() {
		return t_img;
	}

	public WebElement getQuickview_Btnn() {
		return quickview_Btnn;
	}

	public WebElement getQtyy() {
		return qtyy;
	}

	public WebElement getSizee() {
		return sizee;
	}

	public WebElement getColorr() {
		return colorr;
	}

	public WebElement getAddToCartt() {
		return addToCartt;
	}

	public WebElement getClickk() {
		return clickk;
	}

	public WebElement getProceedout11() {
		return proceedout11;
	}

	
	
	//*[@id="layer_cart"]/div[1]/div[2]/div[4]/a/span
	

}
