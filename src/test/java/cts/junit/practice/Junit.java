package cts.junit.practice;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;





public class Junit {
	
	@Test
	public void onetimesetup() {
	//import from org.junit not from testng
		Assert.assertEquals("yahoo", "yahoo");
		
	}
	
	@BeforeClass
	public static void google() {
		
		Assert.assertEquals("google","google");
	}

	@Ignore
	public void facebook() {
	Assert.assertEquals("google","google");
	}
}
