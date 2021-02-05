package base;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public ResourceBundle rb;
	public WebDriver driver;
	
	public Base()
	{
		rb= ResourceBundle.getBundle("config");
		
	}
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver= new ChromeDriver();
		/*try {
			if(rb.getString("browser").equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				driver= new ChromeDriver();
			}
			else if(rb.getString("browser").equalsIgnoreCase("FF"))
			{
				System.setProperty("Webdriver.gecko.driver","./Driver/geckodriver.exe");
				driver= new FirefoxDriver();
			}
			else 
			{
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				driver= new ChromeDriver();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error in loading webdriver !! setProperty");
		}
		*/
		driver.manage().timeouts().pageLoadTimeout((Integer.parseInt(rb.getString("Pageloadtime"))), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait((Integer.parseInt(rb.getString("implicitwait"))), TimeUnit.SECONDS);
		driver.get(rb.getString("url"));
	}
}
