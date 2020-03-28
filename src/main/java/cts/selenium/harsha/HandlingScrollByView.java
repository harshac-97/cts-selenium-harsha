package cts.selenium.harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollByView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
  driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");		
  //Typecating
  JavascriptExecutor js = (JavascriptExecutor )driver;
  
  WebElement element = driver.findElement(By.xpath("//div[@id='mCSB_1_container']//p[contains(text(),'Sed ut perspiciatis unde omnis iste natus error si')]"));
  
  js.executeScript("arguments[0].scrollIntoView(true)", element);
  System.out.println(element.getText());

  

	}

}
