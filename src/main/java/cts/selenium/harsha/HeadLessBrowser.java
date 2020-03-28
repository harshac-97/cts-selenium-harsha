package cts.selenium.harsha;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\cts-selenium-harsha\\\\src\\\\test\\\\resources\\\\binaries\\\\chromedriver.exe");
	//Method to make a browser Headless(Execution takes place without launch of browser)
		ChromeOptions options = new ChromeOptions();
	    options.setHeadless(true);
	    ChromeDriver driver=new ChromeDriver(options);
	    driver.get("https://www.zamzar.com/login/");
	    
		  //Method to get title
  String title = driver.getTitle();
  System.out.println(title);
       //Method to get URL
  String url = driver.getCurrentUrl();
  System.out.println(url);
       //Method to navigate to other url
  driver.navigate().to("https://accounts.google.com/AccountChooser?service=mail&continue=https://mail.google.com/mail/");
  String url1 = driver.getCurrentUrl();
  System.out.println(url1);
  //Method to Navigate back
  driver.navigate().back();
  String url2 = driver.getCurrentUrl();
  System.out.println(url2);
  
  
  //Method to Navigate Forward
  driver.navigate().forward();
  String url3 = driver.getCurrentUrl();
  System.out.println(url3);
  
  //Method to Refresh Browser
  driver.navigate().refresh();
  String url4 = driver.getCurrentUrl();
  System.out.println(url4);
  
  
  
}
}