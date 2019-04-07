package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class HomePage extends Base {

	//Page factory definitions
	@FindBy(id="search-input-location")
	WebElement search;
	
	@FindBy(id="search-submit")
	WebElement submit;
	 
	//page elements initialisation in constructor
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SerachText(String text)
	{
		search.sendKeys(text);
	}
	public void SubmitClick()
	{
		submit.click();
	}
}
