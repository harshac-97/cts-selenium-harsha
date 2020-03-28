package cts.selenium.harsha;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
  @Test
  public void loginTest() throws Exception {
	  
	  Assert.assertEquals("loginsuccess", "loginsuccess");
	  
	  // start reporters--> creates report html file at specified path
      ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\HARSHA\\eclipse-workspace\\cts-selenium-harsha\\Reports\\extent.html");
      
      
   // create ExtentReports and attach reporter(s)
      ExtentReports extent = new ExtentReports();
      extent.attachReporter(htmlReporter);
      
   // creates a toggle/format for the given test, adds all log events under it    
      ExtentTest test = extent.createTest("LoginTest", "Description Of Test Case");

      // log(Status, details)
      test.log(Status.INFO, "Description");
      // log(Status, details)
      test.log(Status.PASS, "Login Success");
      
      ExtentTest test1 = extent.createTest("LogoutTest", "Description Of Test Case");

      // log(Status, details)
      test1.log(Status.INFO, "Description");
      // log(Status, details)
      test1.log(Status.FAIL, "Logout Failed");
      
      //This is used to display image for the failed test in html page
      test1.fail("Failed because of some issues", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\HARSHA\\eclipse-workspace\\cts-selenium-harsha\\Screenshots\\facebook.png").build());
      
   // calling flush writes everything to the log file
      extent.flush();
      
      

  }
}
