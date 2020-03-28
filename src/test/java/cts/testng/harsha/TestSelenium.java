package cts.testng.harsha;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestSelenium {
		@Test
		public void testconfig() throws Exception {

		File src=new File("C:\\Users\\HARSHA\\eclipse-workspace\\cts-selenium-harsha\\Configuration\\Config.property");

		FileInputStream fis=new FileInputStream(src);

		Properties pro=new Properties();

		pro.load(fis);

		String chromepath=pro.getProperty("chromeDriver");

		System.out.println("Hey chrome path is " + chromepath);

		}
	}
		