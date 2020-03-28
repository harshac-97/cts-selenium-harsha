package cts.selenium.harsha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WoSetProperty {
//This is the Latest Model to Launch Chrome Browser we Need to add Dependencies to do this
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		

	}

}
