package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class PropertyDetails extends Base{
	
	@FindBy(className="ui-agent__name")
	WebElement Agentname;
	
	public PropertyDetails()
	{
		PageFactory.initElements(driver, this);
	}
	public String ClickAgent_getAgent()
	{
		String Agent_Name=Agentname.getText();
		Agentname.click();
		return Agent_Name;
	}
}
