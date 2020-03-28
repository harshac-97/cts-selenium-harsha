package cts.selenium.harsha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LatestMozillalauncher {
	//Add Dependencies code before  using this Method
	public static void main(String[] args) {
		
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.redbus.in");
	

}
}