package cts.selenium.harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodEx2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARSHA\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.zamzar.com/login/");
		  
		  //Check wheather the particular element is Present (gives boolean as output)
		  boolean a = driver.findElement(By.xpath("//input[@id='username']")).isDisplayed();
		  System.out.println(a);
		//Check wheather the particular element is Enabled (gives boolean as output)
		  boolean b = driver.findElement(By.xpath("//input[@id='username']")).isEnabled();
		  System.out.println(b);
}
}