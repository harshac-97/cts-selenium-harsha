package cts.selenium.harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("file:///C:/Users/Dell/Downloads/FrameExample.html");
		  
		  //Method to select the required IFrame using Frame Name
		  driver.switchTo().frame("Site");
		  //Operation on selected Iframe
		  driver.findElement(By.partialLinkText("MENU")).click();
		  Thread.sleep(3000);
		  
		  //Method to switch to main frame
		  
		  driver.switchTo().defaultContent();
		  
		  //Method to find Frame by FrameId 
		  driver.switchTo().frame("Work");
		  driver.findElement(By.partialLinkText("MENU")).click();
		  Thread.sleep(3000);
		  driver.switchTo().defaultContent();
		  
		  //Method to find IFrame by Dynamic Xpath
		  WebElement myF  = driver.findElement(By.xpath("//iframe[@title='selenium']"));
		  driver.switchTo().frame(myF);
		  driver.findElement(By.partialLinkText("MENU")).click();
		  
		  driver.switchTo().defaultContent();
		  
		  driver.findElement(By.partialLinkText("click here to visit facebook")).click();
		  
		  
		  
		  
	}

}
