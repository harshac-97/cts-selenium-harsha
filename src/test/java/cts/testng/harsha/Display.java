package cts.testng.harsha;

import org.testng.annotations.Test;

public class Display {
  @Test(groups= {"Vendor"})
  public void Vendor1() {
	  System.out.println("Vendor1");
  }
  @Test(groups= {"Vendor"})
  public void Vendor2() {
	  System.out.println("Vendor3");
  }
  @Test(groups= {"Vendor"})
  public void Vendor3() {
	  System.out.println("Vendor3");
  }
  
  @Test(groups= {"Customer"})
  public void Customer1() {
	  System.out.println("Customer1");
  }
  
  @Test(groups= {"Customer"})
  public void Customer2() {
	  System.out.println("Customer2");
  }
  
  @Test(groups= {"Customer"})
  public void Customer3() {
	  System.out.println("Customer3");
  }
  
  @Test(groups= {"Vendor","Customer"})
  public void Admin1() {
	  System.out.println("Admin1");
  }
  
  @Test(groups= {"Vendor","Customer"})
  public void Admin2() {
	  System.out.println("Admin2");
  }

  
  
  
  
}
