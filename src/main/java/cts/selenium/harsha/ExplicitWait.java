package cts.selenium.harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\cts-selenium-harsha\\\\src\\\\test\\\\resources\\\\binaries\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("C:\\Users\\Dell\\eclipse-workspace\\Harsha_WebProject\\WebContent\\how-to-use-explicit-wait-in-selenium.html");
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
	String data=driver.findElement(By.xpath("//p[text()='WebDriver']")).getText();
	System.out.println(data);

	}

	}


