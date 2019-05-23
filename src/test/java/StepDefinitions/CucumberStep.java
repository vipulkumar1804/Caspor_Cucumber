package StepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Common.Utilities;
import cucumber.api.java.en.Given;

public class CucumberStep {

	Properties OR=null;
	WebDriver driver = null;
	
	@Given("^user open Caspor site$")
	public void user_open_Caspor_site() throws IOException, InterruptedException
	{
		

		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") +"\\src\\test\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
}
