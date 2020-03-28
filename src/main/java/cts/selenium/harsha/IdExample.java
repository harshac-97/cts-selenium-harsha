package cts.selenium.harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARSHA\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  
		 driver.get("https://www.facebook.com/");
		 /* driver.manage().window().maximize();
		  
		  driver.findElement(By.id("email")).sendKeys("harshahvr97@gmail.com");
		  Thread.sleep(5000);
		  driver.findElement(By.id("email")).clear();
		  Thread.sleep(5000);*/
		 
		//Alternative code
		 WebElement cts1  = driver.findElement(By.id("email"));
		 driver.manage().window().maximize();
		 cts1.sendKeys("harshahvr97@gmail.com");
		 Thread.sleep(5000);
		 cts1.clear();
		 Thread.sleep(5000);
		 
		  
		  
		  driver.close();
	}

}
