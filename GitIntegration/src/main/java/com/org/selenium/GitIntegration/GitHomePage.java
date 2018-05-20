/**
 * 
 */
package com.org.selenium.GitIntegration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
		driver.findElement(By.xpath(features));
		driver.findElement(By.xpath(business));
		driver.findElement(By.xpath(explore));
	}

}
