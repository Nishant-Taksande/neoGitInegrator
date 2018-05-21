package com.demo.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.library.Library;
import com.demo.pages.GitHomePage;

public class GitTest {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		System.out.println("Im in Before Class");
		Library l = new Library();
		driver = l.launchDriverInstance();
	}

	@Test
	public void f() {
		System.out.println("Im in Test Method");
		driver.get("http://www.github.com");
		GitHomePage ghp = new GitHomePage(driver);
		ghp.verifyUI();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Im in After Class");
		driver.close();
		driver.quit();
	}

}
