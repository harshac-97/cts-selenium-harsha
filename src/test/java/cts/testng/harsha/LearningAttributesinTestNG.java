package cts.testng.harsha;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningAttributesinTestNG {
	//Methods will Run in Alphabetal Order..To change this order we use Priority
	//enabled is used to stop execution of a particular method
	@Test(priority=1,enabled=false)
	public void TestC() {
		Assert.assertEquals("Google","Google");
	}
	//description method is used to add details for the test case
	@Test(priority=3,description = "Test Method yahoo")
	public void TestD() {
		//Assert.assertEquals("yahoo","yahoo");
		//To check failure dependency or HARD DEPENDENCY..Refer-1
		Assert.assertEquals("yahoo1","yahoo");
	}
	//invocationCount is used to repeat the execution of method
	//invocationTimeOut is used to define time for the execution of invocationCount in ms

	@Test(priority=2,invocationCount = 9,invocationTimeOut = 3)
	public void TestA() {
		Assert.assertEquals("yahoo1","yahoo1");
	}
	//dependsOnMethods when used the dependend method runs only after this method is executed irrespective of prioriry
	//here TestB is executed only after TestD
	//If TestB is failed then TestD is skipped ---->Refer-1
	//In order to avoid skip we should use alwaysRun
	@Test(priority=4,description = "Test Method yahoo2",dependsOnMethods={"TestD"},alwaysRun=true,invocationCount = 3)
	public void TestB() {
		Assert.assertEquals("yahoo2","yahoo2");
	}
}
