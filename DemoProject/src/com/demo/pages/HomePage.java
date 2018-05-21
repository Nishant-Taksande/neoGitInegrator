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
public class HomePage {

	private WebDriver driver;

	
	// Locators
	public static String searchEdit = "//input[@name='q']";
	public static String searchButton = "//input[@value='Google Search']";
	public static String feelingLucky = "//input[@value=\"I'm Feeling Lucky\"]";

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void verifyUI() {
		Library.finel(driver, searchEdit);
		Library.finel(driver, searchButton);
		Library.finel(driver, feelingLucky);
	}

}
