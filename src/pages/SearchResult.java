package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class SearchResult extends Base {
	
	String s="";
	ArrayList list=new ArrayList();
	
	public void DisplayPrices() {
		List<WebElement> elements=	driver.findElements(By.xpath("//a[@class='listing-results-price text-price']"));
			for(int i=4;i<=elements.size();i++) {
				s= driver.findElement(By.xpath("(//a[@class='listing-results-price text-price'])["+i+"]")).getText();
				s=s.replaceAll("[a-zA-Z//£//,// ]", "");
				list.add(Integer.parseInt(s));
			}
			Collections.sort(list);
			Collections.reverse(list);
			System.out.println("The prices in decending order");
			for (Object obj: list) { 		      
		           System.out.println(obj); 		
		      }
			
	}
	
	public void SelectProperty(int a)
	{
		a=a+3;
		driver.findElement(By.xpath("(//a[@class='listing-results-price text-price'])["+a+"]")).click();
	}

}
