package steps;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Locators;

public class WebDriverMethods {
	
	public WebDriver driver=null; 
	public Locators objLocators=new Locators();
	public String URL="https://phptravels.com/demo/";
	
	public void launchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A714978\\github_workspace\\WebDriverMethods\\src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	public void browserCommands()
	{
		driver.get(URL);
		System.out.println("Page Source : "+driver.getPageSource());
		System.out.println("Current URL :"+driver.getCurrentUrl());
		System.out.println("Title :"+driver.getTitle());
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		WebElement element=driver.findElement(objLocators.loginlink);
		System.out.println("Login Link displayed "+element.isDisplayed());
		List<WebElement> elements=driver.findElements(objLocators.alllink);
		for(int i=0;i<elements.size();i++)
		{
			String url=elements.get(i).getAttribute("href");
			System.out.println(i+1 +" : "+url);
		}
		
		System.out.println("Window Name "+driver.getWindowHandle());
		Set<String> allWindow=driver.getWindowHandles();
		System.out.println("All Windows :");
		for(String str:allWindow)
		{
			System.out.println(str);
		}
		
		driver.quit();
		
		
	}
	
	


}
