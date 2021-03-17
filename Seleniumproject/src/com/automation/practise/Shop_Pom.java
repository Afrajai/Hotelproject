package com.automation.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.pom.Addcart_Pom;
import com.selenium.pom.Backorder_Pom;
import com.selenium.pom.Casualdress_Pom;
import com.selenium.pom.Conformodrer_Pom;
import com.selenium.pom.Homeoage_POM;
import com.selenium.pom.Login_Pom;
import com.selenium.pom.Paybywire_Pom;
import com.selenium.pom.Proceed2_Pom;
import com.selenium.pom.Proceed3_Pom;
import com.selenium.pom.Proceed4_Pom;
import com.selenium.pom.SecProce3;
import com.selenium.pom.Sec_Confrimorder;
import com.selenium.pom.Sec_Tshirtpom;
import com.selenium.pom.Secpaywire;
import com.selenium.pom.Sectshirt_Proceed1;
import com.selenium.pom.Sectshirt_Proceed2;
import com.selenium.pom.Signout_Pom;
import com.selenium.pom.Women_Pom;

public class Shop_Pom extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = getBrowser("chrome");
		getUrl("http://automationpractice.com/index.php");

		Homeoage_POM home = new Homeoage_POM(driver);
		clickOnElement(home.getSign());

		Login_Pom login = new Login_Pom(driver);
		inputValueElement(login.getEmail(), "nourin2@gmail.com");
		inputValueElement(login.getPassword(), "abdeen123");
		clickOnElement(login.getSign());

		Women_Pom womenn = new Women_Pom(driver);
		mouseOver(womenn.getWomen(), "move");
		mouseOver(womenn.getCasual(), "click");
		wait(300);

		Casualdress_Pom cas = new Casualdress_Pom(driver);
		mouseOver(cas.getCas_Img(), "move");
		clickOnElement(cas.getQuickview_Btn());
		driver.switchTo().frame(0);
		wait(200);
		clickOnElement(cas.getQtyy());
		wait(10);
		clickOnElement(cas.getSize());
		clickOnElement(cas.getColor());
		clickOnElement(cas.getAddToCart());
		Thread.sleep(1000);
		clickOnElement(cas.getClick());

		Thread.sleep(2000);
		
		clickOnElement(cas.getProceedout1());
		wait(20);

		
		
		Proceed2_Pom p2 =new Proceed2_Pom(driver);
		clickOnElement(p2.getProceed2());
		Thread.sleep(1000);
		
		Proceed3_Pom p3= new Proceed3_Pom(driver);
		clickOnElement(p3.getProceed3());
		wait(20);
		
		Proceed4_Pom p4=new Proceed4_Pom(driver);
		clickOnElement(p4.getCheckbox());
		wait(20);
		clickOnElement(p4.getProceed4());
		wait(20);
		
		Paybywire_Pom p5 = new Paybywire_Pom(driver);
		
		clickOnElement(p5.getPayby());
		wait(20);
		
		Conformodrer_Pom p6 = new Conformodrer_Pom(driver);
		clickOnElement(p6.getConform());
		wait(20);
		
		takescreen(driver,"C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Snapshot\\picpom.png");
		wait(20);
		
		Backorder_Pom p7 = new Backorder_Pom(driver);
		clickOnElement(p7.getBack());
		wait(20);
		
		Sec_Tshirtpom tshirt = new Sec_Tshirtpom(driver);
		clickOnElement(tshirt.getTshirt());
		wait(20);
		
		mouseOver(tshirt.getT_img(), "move");
		clickOnElement(tshirt.getQuickview_Btnn());
		driver.switchTo().frame(0);
		wait(200);
		clickOnElement(tshirt.getQtyy());
		wait(10);
		clickOnElement(tshirt.getSizee());
		clickOnElement(tshirt.getColorr());
		clickOnElement(tshirt.getAddToCartt());
		Thread.sleep(1000);
		clickOnElement(tshirt.getClickk());

		Thread.sleep(2000);
		
		clickOnElement(tshirt.getProceedout11());
		wait(20);
		
		Sectshirt_Proceed1 se = new Sectshirt_Proceed1(driver);
		clickOnElement(se.getT_procee1());
		wait(20);
		
		Sectshirt_Proceed2 s2 = new Sectshirt_Proceed2(driver);
		clickOnElement(s2.getProcce());
		wait(20);
		
		
		SecProce3 sec =new SecProce3(driver);
		clickOnElement(sec.getCheckk());
		wait(20);
		clickOnElement(sec.getProce3());
		wait(20);
		
		 
		Secpaywire secpay = new Secpaywire(driver);
		clickOnElement(secpay.getSecpay());
		wait(20);
		
		Sec_Confrimorder secodrer = new Sec_Confrimorder(driver);
		clickOnElement(secodrer.getSecconfirm_Btn());
		wait(10);
		
		//takescreen(driver,"C:\\Users\\Welcome\\eclipse-workspace\\Seleniumproject\\Snapshot\\tshritpic.png");
		//wait(20);
		
		Signout_Pom sgn =new Signout_Pom(driver);
		clickOnElement(sgn.getSignout_Btn());
		wait(10);
		
		
	}
	
	
	
}

