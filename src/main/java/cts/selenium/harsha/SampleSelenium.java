package cts.selenium.harsha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSelenium {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://mail.google.com/mail/u/0/");
		  driver.manage().window().maximize();
		  driver.close();
	}

}
