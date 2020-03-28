package cts.selenium.harsha;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.w3schools.com/html/html_tables.asp");		
		  
		  //Getting data from Table 
		  
		  String data = driver.findElement(By.xpath("//td[contains(text(),'Alfreds Futterkiste')]")).getText();
System.out.println(data);
WebElement data1 = driver.findElement(By.xpath("//td[contains(text(),'Centro comercial Moctezuma')]"));
System.out.println(data1.getText());

 //Method to get complete Table

WebElement table = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']"));

List<WebElement> TableDetails = table.findElements(By.tagName("td"));   
System.out.println("SIZE from Method 1 ----> " + TableDetails.size());

//Other Method
List<WebElement> TableData=driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']")).findElements(By.tagName("td"));
System.out.println("SIZE from Method 2 ----> " + TableData.size());


//Displaying Table Data using loop statements
for(int i=0;i<TableDetails.size();i++){
	String output = TableDetails.get(i).getText();
	System.out.println(output);
}

// Navigating to REDBUS Website to select date from Calender (Table)
driver.navigate().to("https://www.redbus.in/");

WebElement src = driver.findElement(By.id("src"));
src.sendKeys("Kukatpally, Hyderabad");

WebElement des = driver.findElement(By.id("dest"));
des.sendKeys("Sholinganallur, Chennai");


driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='wd day'][contains(text(),'16')]")).click();
driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-return-calendar icon']")).click();
driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']//td[@class='wd day'][contains(text(),'26')]")).click();
driver.findElement(By.cssSelector("#search_btn")).click();

	}

}
