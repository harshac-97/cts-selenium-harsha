package cts.selenium.harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		WebElement radioF = driver.findElement(By.xpath("//tr[24]//td[3]//input[2]"));
		radioF.click();
		System.out.println(radioF.isDisplayed());
		System.out.println(radioF.isSelected());
		System.out.println(radioF.isEnabled());
				
		WebElement radioM = driver.findElement(By.xpath("//tr[24]//td[3]//input[1]"));
		System.out.println(radioM.isSelected());
	}

}
