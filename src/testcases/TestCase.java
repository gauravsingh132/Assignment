package testcases;


import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.AgentPage;
import pages.HomePage;
import pages.PropertyDetails;
import pages.SearchResult;

public class TestCase extends Base {
	TestCase Obj_Testcase;
	HomePage Obj_Homepage;		
	SearchResult Obj_SearchRestult;
	PropertyDetails Obj_PropertyDetails;
	AgentPage Obj_AgentPage;

	
	@BeforeMethod
	public void initialSetup()
	{
		Obj_Testcase= new TestCase(); // creating object of testCase class
		Obj_Testcase.Initialize();
		Obj_Homepage= new HomePage(); // creating object of HomePage class to use in Test cases
		Obj_SearchRestult= new SearchResult(); // creating object of SearchResult class to use in Test cases
		Obj_PropertyDetails =new PropertyDetails(); // creating object of PropertyDetails class to use in Test cases
		Obj_AgentPage = new AgentPage(); // creating object of AgentPage class to use in Test cases
	}

	@Test
	public void Tc_01()
	{
		//search text
		Obj_Homepage.SerachText("london");		
		Obj_Homepage.SubmitClick();
		Obj_SearchRestult.DisplayPrices(); //display prices in descending order
		Obj_SearchRestult.SelectProperty(5); // click on 5th property in list
		String AgentName_propertyPage=Obj_PropertyDetails.ClickAgent_getAgent(); // Get agent name from property page and click on it
		String AgentName_AgentPage= Obj_AgentPage.getname_agentpage(); // Get agent name from Agent page

		//match name on Agentpage and property page
		if(AgentName_propertyPage.equals(AgentName_AgentPage))
		{
			System.out.println("Name of agents are same on Agent page and Property page");
		}else {
			System.out.println("Agent names are different on Agent page and Property page");
		}
	
	}

}
