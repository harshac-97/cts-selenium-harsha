package cts.selenium.harsha;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {
	public static void main(String[] args) throws  IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.freepdfconvert.com/");
		  driver.findElement(By.xpath("//div[@class='btn btn-success icon-left-large img-plus-white upload-btn']")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  Runtime.getRuntime().exec("C:\\AUTOIT\\SamplePrg333.exe");
		
		  //driver.findElement(By.xpath("//div[@class='converter-btn btn btn-success pdf-to-word img-pdf-to-word-white icon-left']")).click();
		
		  System.out.println("Succesfully Uploaaded");

}
}