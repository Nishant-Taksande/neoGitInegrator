package com.demo.tests;

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
	public void beforeClass() {
		System.out.println("Im in Before Class");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void f() {
		System.out.println("Im in Test Method");
		driver.get("http://www.google.com");
		HomePage hp = new HomePage(driver);
		hp.verifyUI();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Im in After Class");
		driver.close();
		driver.quit();
	}

}
