package cts.selenium.harsha;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("file:///C:/Users/Dell/Desktop/multiple-window-examples.html");
		  
		  //Method to handle window(get window Id)
		  String win1 =  driver.getWindowHandle();
		 System.out.println("Window ID 1: " +  win1);

		 driver.findElement(By.name("link1")).click();
		 
		 //Method to handle windows(to get all window Id's)
		 Set<String> allWind = driver.getWindowHandles();
		 System.out.println("All Windows : " +  allWind);
		 
		 
		//Displaying Window details using ArrayList Class
		 ArrayList<String> tabnames = new ArrayList<String>(allWind);
		 System.out.println(tabnames);
		 
		 String gogl = tabnames.get(0);
		 System.out.println("Google id " + gogl);
		 Thread.sleep(3000);
		 driver.switchTo().window(tabnames.get(0));
		 Thread.sleep(3000);
		 driver.switchTo().window(tabnames.get(1));
		 
		
		 driver.findElement(By.name("q")).sendKeys("Happy Holi");
		 Thread.sleep(3000);
		driver.switchTo().window(win1);
		 Thread.sleep(3000);
		 
		 driver.close();
		 Thread.sleep(3000);
		 driver.quit();
		 
				 
	
						 
				 
		 
		 
		 
		
		 //closes google window
		 
} 

}