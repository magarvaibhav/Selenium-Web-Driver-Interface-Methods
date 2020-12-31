package test;

import steps.WebDriverMethods;

public class WebDriverMethodHandler {

	public static void main(String[] args) 
	{
		WebDriverMethods objWebDriverMethods=new WebDriverMethods();
		objWebDriverMethods.launchChromeBrowser();
		objWebDriverMethods.browserCommands();
	}
}
