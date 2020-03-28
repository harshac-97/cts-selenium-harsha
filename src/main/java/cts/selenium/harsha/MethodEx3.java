package cts.selenium.harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodEx3 {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://www.zamzar.com/login/");
			  boolean a =driver.findElement(By.xpath("//input[@name='rememberme']")).isSelected();
			  System.out.println(a);
			  
			  driver.findElement(By.xpath("//input[@name='rememberme']")).click();

			  boolean b =driver.findElement(By.xpath("//input[@name='rememberme']")).isSelected();
			  System.out.println(b);
}
	}

