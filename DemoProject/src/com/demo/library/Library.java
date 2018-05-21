/**
 * 
 */
package com.demo.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author asthammishra
 *
 */
public class Library {

	public WebDriver launchDriverInstance() {

		String ant = System.getProperty("isAntBuild");
		System.out.println(ant);
		
		if (ant != null) {
			System.setProperty("webdriver.chrome.driver", "DemoProject/chromedriver");
		} else {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
		}

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void finel(WebDriver driver, String locator) {
		
		System.out.println("Finding Element with Locator:" + locator);
		driver.findElement(By.xpath(locator));
		
	}
}
