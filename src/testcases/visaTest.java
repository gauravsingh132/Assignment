package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Base;

public class visaTest extends  Base{

	@Test
	public void login() {
		init();
	}
	@Test
	public void visaTestCase()
	{
		//relativeXPathForInput(WebDriver driver, String pageUrl) 
		//absoluteXPathForInput(WebDriver driver, String pageUrl) 
	    //xpath: //input[@class='large']], 
	    //xpath: //input[@class='large']], 
		//xpath: //input[@class='large']], 
		//x/path: //input[@class='large']],   
		//xpath: //input[@class='large']]]

		
		List<WebElement> element=driver.findElements(By.xpath("//input[@class='large']"));
		System.out.println(element.toString());
	}
	
}
