package cts.testng.harsha;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Validation {
  
  //Method for test case verification message..MSSAGE DISPLYED IF test case is failed
  
 
  @Test
  public void test1() {
	  String s = "Harsha";
	  Assert.assertTrue(s.contains("Harsha"), "Name Matched");
  }
  //Even if partial string is corect it is accepting
  @Test
  public void test2() {
	  String s1 = "Harshavardhan";
	  Assert.assertTrue(s1.contains("Harshv"), "Name Not  Matched");
  }
  //PRINTS message only if data doesnot match
  @Test
  public void test3() {
	  Assert.assertEquals(12, 13, "Drop Down Data Doesnot Match");
  }
  
  @Test
  public void test4() {
	  Assert.assertEquals(12, 12, "Drop Down Data  Matched");
  }
}
