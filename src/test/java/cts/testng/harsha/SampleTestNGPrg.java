package cts.testng.harsha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestNGPrg {
	@Test
	public void verifyTitleOfThePage()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.zamzar.com/login/");
		  String data = driver.getTitle();
		System.out.println(data);
		Assert.assertEquals(data,"Google");
	}

}
