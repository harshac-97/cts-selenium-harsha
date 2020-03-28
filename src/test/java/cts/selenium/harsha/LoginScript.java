package cts.selenium.harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginScript {
  @Test
	  
	  public void loginToApplication() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARSHA\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://opensource-demo.orangehrmlive.com/");
			  driver.findElement(By.name("txtUsername")).sendKeys("admin");
			  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			  driver.findElement(By.id("btnLogin")).click();


  }
}
