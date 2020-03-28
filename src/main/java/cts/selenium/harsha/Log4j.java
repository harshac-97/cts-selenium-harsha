package cts.selenium.harsha;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 Logger logger = Logger.getLogger("Log4j");
 PropertyConfigurator.configure("Log4j.properties");
 
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARSHA\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");

 WebDriver driver = new ChromeDriver();
 
 
 //Log4j code
 
 logger.info("Chrome Driver Opened");
 
driver.get("https://www.facebook.com/");

logger.info("Navigated to facebook");

WebElement cts1  = driver.findElement(By.id("email"));
Thread.sleep(1000);
driver.manage().window().maximize();
Thread.sleep(1000);
cts1.sendKeys("harshahvr97@gmail.com");
logger.info("USERNAME entered");


 
 
}



	}


