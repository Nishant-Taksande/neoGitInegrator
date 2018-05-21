/**
 * 
 */
package com.demo.pages;

import org.openqa.selenium.WebDriver;

import com.demo.library.Library;

/**
 * @author asthammishra
 *
 */
public class GitHomePage {

	private WebDriver driver;

	// Locators
	public static String features = "//a[contains(text(),'Features')]";
	public static String business = "//a[contains(text(),'Business')]";
	public static String explore = "//a[contains(text(),'Explore')]";

	public GitHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void verifyUI() {
		Library.finel(driver, features);
		Library.finel(driver, business);
		Library.finel(driver, explore);
	}

}
