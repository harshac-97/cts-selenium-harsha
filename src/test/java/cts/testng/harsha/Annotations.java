package cts.testng.harsha;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod will execute before every test Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod will execute after every test Method");
  }
  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class will always execute prior to Before Method and Test Method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class will always execute later to After Method and Test Method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest will always execute prior to Before Class, Before Method and Test Method ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test will always execute later to After Method,After Class");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite will always execute prior to all annotations or tests in the suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite will always execute at last when all the annotations or test in the suite have run");
  }
  
  @Test
  public void TestA() {
	  System.out.println("This is TestA");
  }
  
  @Test
  public void TestB() {
	  System.out.println("This is TestB");
  }

  
}
