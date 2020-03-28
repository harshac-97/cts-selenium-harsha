package cts.selenium.harsha;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARSHA\\eclipse-workspace\\cts-selenium-harsha\\src\\test\\resources\\binaries\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		  
		//Selecting the drop the by Value method(we get value from HTML code)
		  Select drop  = new Select(driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[1]")));
		  drop.selectByValue("27");
		//Selecting the drop the by VisibleText in webpage
		  Select drop1  = new Select(driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[2]")));
		  drop1.selectByVisibleText("MAR");
		  
		  Select drop2  = new Select(driver.findElement(By.xpath("/html[1]/body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[22]/td[3]/select[3]")));
		  drop2.selectByVisibleText("1997");
		 
		  
		  //Method to select DropDown List
		  Select drop3  = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		  
		  //Selecting the drop the by index(index starts from '0'by default)
		  drop3.selectByIndex(3);
		  Thread.sleep(3000);
		 
		  //Method to print selected content from dropdown on console window
		  WebElement selectedItem = drop3.getFirstSelectedOption();
		  System.out.println("Selected country is :" +selectedItem.getText());
		
		  drop3.selectByVisibleText("Iceland");
		  WebElement selectedItem1 = drop3.getFirstSelectedOption();
		  System.out.println("Next Selected country is :" +selectedItem1.getText());
		  
		  //To print TOTAL NUMBER OF ELEMENTS IN DROPDOWN list we need to use following method 
		  List <WebElement> listofDropdown = drop3.getOptions();
		  int list1 = listofDropdown.size();
		  System.out.println("No. of Countries in DropDown: " + list1);
		
		  
		//To print ALL THE ELEMENTS IN DROPDOWN list we need to use Loop statement
		  
		  for(WebElement showCont:listofDropdown) {
			  String items = showCont.getText();
			  System.out.println("Countrie Name is:" +items);
			  
			  
					  
		  }
				  
		  
		  driver.close();
}
}
