package pages;


import org.openqa.selenium.By;

import base.Base;

public class AgentPage  extends Base{
	
	
	public String getname_agentpage()
	{
		String Name_Agentpage =driver.findElement(By.xpath("//h1[@class='bottom-half']/b")).getText();
		return Name_Agentpage;
	}
}
