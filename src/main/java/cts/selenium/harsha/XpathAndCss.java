package cts.selenium.harsha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAndCss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.zamzar.com/login/");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("harsha@gmail.com");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abcdefgd222");
		  Thread.sleep(1000);
		  driver.findElement(By.cssSelector("div.container div.row:nth-child(2) div.col-md-6.col-sm-12 form.form-horizontal div.form-group.mt-10:nth-child(4) div.col-lg-offset-3.col-lg-9.col-md-offset-4.col-md-8.col-sm-offset-3.col-sm-9 > button.btn.btn-primary.btn-lg.pull-left:nth-child(1)")).click();
		  

}
}