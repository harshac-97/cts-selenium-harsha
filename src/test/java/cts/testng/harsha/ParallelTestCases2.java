package cts.testng.harsha;

import org.testng.annotations.Test;

public class ParallelTestCases2 {
 
  @Test
  public void testcase4() {
	  long id4 = Thread.currentThread().getId();
	  System.out.println("Testcase4" + " " + id4);
  }
  
  @Test
  public void testcase5() {
	  long id5 = Thread.currentThread().getId();
	  System.out.println("Testcase5" + " " + id5);
  }
  
  @Test
  public void testcase6() {
	  long id6 = Thread.currentThread().getId();
	  System.out.println("Testcase6" + " " + id6);
  }
}

