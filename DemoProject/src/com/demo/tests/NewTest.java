package com.demo.tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.pages.HomePage;

public class NewTest {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() throws Exception {
		System.out.println("Im in Before Class");
//		System.setProperty("webdriver.chrome.driver", relToAbs("/chromedriver"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
