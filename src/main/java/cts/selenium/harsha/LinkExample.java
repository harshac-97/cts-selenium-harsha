package cts.selenium.harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.co.in/");
		  Thread.sleep(3000);
		  //driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Gm")).click();
		  Thread.sleep(5000);
		  
		  driver.close();

	}

}
