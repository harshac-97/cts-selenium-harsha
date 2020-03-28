package cts.selenium.harsha;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
    driver.get("https://www.zamzar.com/");		
    //Typecating
    JavascriptExecutor js = (JavascriptExecutor )driver;
    
   // Thread.sleep(3000);
    //JS for scrolloing upto 400px
   // js.executeScript("window.scrollBy(0,400)", "");
    Thread.sleep(3000);
//to scroll down
    js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
}
}