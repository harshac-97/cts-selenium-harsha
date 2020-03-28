package cts.selenium.harsha;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		 
		  
		  driver.get("https://www.redbus.in");	
		
		 
		  driver.manage().window().maximize();
		  
		  //This will complete the operation by taking sufficient time and saves time if operation is completed in lesss than 10 seconds
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Hyderabad");
		  
	}

}
