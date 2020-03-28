package cts.selenium.harsha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxExampla {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		  
		  driver.get("https://www.redbus.in");	
	}
}
