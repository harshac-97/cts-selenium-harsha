package cts.testng.harsha;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
@Test
public void TestA() {
	Assert.assertEquals("Google","Google");
}
@Test
public void TestB() {
	Assert.assertEquals("yahoo1","yahoo");
}
@Test
public void TestC() {
	Assert.assertEquals("yahoo","yahoo");
}
}
