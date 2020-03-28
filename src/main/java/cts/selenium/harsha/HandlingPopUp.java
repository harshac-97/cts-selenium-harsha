package cts.selenium.harsha;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_ga=2.126897421.1203092484.1583388852-1182286616.1583388852");
		  driver.findElement(By.xpath("//span[@id='HDisplayDefault.Rb14.C3']//img[@id='user-id-goahead']")).click();
		  driver.findElement(By.xpath("//input[@id='VALIDATE_CREDENTIALS1']")).click();
		  
		  //Method to get error message displayed in pop up window
		  Alert PopUpName = driver.switchTo().alert();
		 String errormessage =  PopUpName.getText();
		 System.out.println(errormessage);
		 
		 Thread.sleep(3000);
		 
		 PopUpName.accept();
}
}