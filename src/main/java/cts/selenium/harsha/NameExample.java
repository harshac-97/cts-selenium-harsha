package cts.selenium.harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameExample {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.zamzar.com/login/");
 // driver.findElement(By.name("username")).sendKeys("harshahvr97@gmail.com"); 
  driver.findElement(By.className("form-control")).sendKeys("harshahvr97@gmail.com");
  Thread.sleep(3000);
  
	 
  
  
  driver.close();
  
	}

}
