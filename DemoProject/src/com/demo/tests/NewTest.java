package com.demo.tests;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.library.Library;
import com.demo.pages.HomePage;

public class NewTest {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() throws Exception {
		System.out.println("Im in Before Class");
		Library l = new Library();
		driver = l.launchDriverInstance();
	}

	@Test
	public void testMethod() throws Exception {
		System.out.println("Im in Test Method");
		driver.get("http://www.google.com");
		HomePage hp = new HomePage(driver);
		hp.verifyUI();
	}

	@AfterClass
	public void afterClass() throws Exception {
		System.out.println("Im in After Class");
		driver.close();
		driver.quit();
	}
	
	public String relToAbs(String relativePath) throws IOException {
		
		Path pa = Paths.get("chromedriver");
		System.out.println(pa.toAbsolutePath().toString()); 
		return pa.toAbsolutePath().toString();
	}

}
