package cts.testng.harsha;

import org.testng.annotations.Test;

public class ParallelTestCases {
  @Test
  public void testcase1() {
	  long id1 = Thread.currentThread().getId();
	  System.out.println("Testcase1" + "....> " + id1);
  }
  
  @Test
  public void testcase2() {
	  long id2 = Thread.currentThread().getId();
	  System.out.println("Testcase2" + "....> " + id2);
  }
  
  @Test
  public void testcase3() {
	  long id3 = Thread.currentThread().getId();
	  System.out.println("Testcase3" + "....> " + id3);
  }
}
