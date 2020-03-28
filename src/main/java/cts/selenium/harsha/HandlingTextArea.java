package cts.selenium.harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTextArea {
	

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARSHA\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://en.wikipedia.org/wiki/Cognizant");
	  //Method to get text area in the webpage
	  String a = driver.findElement(By.xpath("//p[1]")).getText();
	  System.out.println(a);
}
}