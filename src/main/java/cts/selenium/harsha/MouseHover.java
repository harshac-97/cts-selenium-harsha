package cts.selenium.harsha;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.carmax.com/");
		  
		  //Method for Mouse Actions available in SELENIUM
		  Actions mouse = new Actions(driver);
		  
		 WebElement mousehovr = driver.findElement(By.xpath("//span[@class='header-helpful-links-title']"));
		 //build() & perform(); used to perform mouse actions
		 mouse.moveToElement(mousehovr).build().perform();
		  
       driver.findElement(By.partialLinkText("FAQ")).click();
		  
	}

}
