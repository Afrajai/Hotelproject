package com.automation.practise;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_DropDown {
	
	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", 
		System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement multi_Drop = driver.findElement(By.id("multi-select"));
		Select s = new Select(multi_Drop);
		
		//ismultiple
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		///get the options
		System.out.println("list of options");
		List<WebElement> options = s.getOptions();
		
		//fore
		for (WebElement getoptions : options) {
			String text = getoptions.getText();
			System.out.println(text);
			}
		
		//to get the size
		System.out.println("size");
		int size = options.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) { //options.size instead of i
			
			if(i==0 || i==3||i==7)  //particular values 0,3,7 mattum varum
			{
				s.selectByIndex(i);
			}
		}
		
		
		List<WebElement> all_Selected = s.getAllSelectedOptions();
		for (WebElement selected: all_Selected) {
			
			System.out.println( selected.getText());
		}
		
		System.out.println(" first select");
		WebElement firstSelected = s.getFirstSelectedOption();
		
		String text = firstSelected.getText();
		
		System.out.println(text);
	}
}
