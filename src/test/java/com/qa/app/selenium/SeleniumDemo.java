package com.qa.app.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo {

	private RemoteWebDriver driver;// driver class to handle every browser

//	@BeforeAll//beforeClass

	@BeforeEach // before
	// open a browser
	public void setup() {
		this.driver = new ChromeDriver();// linking our driver to chrome - expecting a chrome browser
		this.driver.manage().window().maximize();// maximise the pop-up window
		
//		this.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);//implicit wait - global, so waits x amount time for the driver(webpage)
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
		this.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));//implicit wait

	}
	
	@Test
	public void testGoogle() {
		this.driver.get("https://www.google.com/");
		WebElement agreeBttn = this.driver.findElement(By.id("L2AGLb"));// finds the "Accept all" button by its id
		agreeBttn.click();// Clicks the button
		WebElement searchBar = this.driver.findElement(By.name("q"));// finds the search bar
		searchBar.sendKeys("disney");// type in "disney" into the search bar
		searchBar.sendKeys(Keys.ENTER);// alternative: searchBar.submit(); - press enter
		WebElement text = this.driver.findElement(By.cssSelector("#kp-wp-tab-overview > div.TzHB6b.cLjAic.LMRCfc > div > div > div > div > div > div:nth-child(4)"));
		//explicit wait - for individual elements
		new WebDriverWait(driver, Duration.ofMillis(5000)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#kp-wp-tab-overview > div.TzHB6b.cLjAic.LMRCfc > div > div > div > div > div > div:nth-child(4)")));
		//fluent wait--------------------           exits                              checks again                        element to find
		new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(10000)).pollingEvery(Duration.ofMillis(5000)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#kp-wp-tab-overview > div.TzHB6b.cLjAic.LMRCfc > div > div > div > div > div > div:nth-child(4)")));
		
		Assertions.assertTrue(text.getText().contains("16 October 1923"));
	}
	
	@Test
	public void testQA() {
		this.driver.get("https://www.google.com/");
		WebElement agreeBttn = this.driver.findElement(By.id("L2AGLb"));// finds the "Accept all" button by its id
		agreeBttn.click();// Clicks the button
		WebElement searchBar = this.driver.findElement(By.name("q"));// finds the search bar
		searchBar.sendKeys("qa");// type in "disney" into the search bar
		searchBar.sendKeys(Keys.ENTER);// alternative: searchBar.submit(); - press enter
		WebElement qaLink = this.driver.findElement(By.className("yuRUbf"));
		qaLink.click();
		WebElement text = this.driver.findElement(By.cssSelector("body > div.site-container > footer > div.container > div.footer__inner > div.footer__right > p"));
		Assertions.assertTrue(text.getText().contains("International House, 1 St Katharine’s Way, London, E1W 1UN"));
	}
	

	@AfterEach//after
	public void closeBrowser() {
		this.driver.close();//close the pop-up page once the test is completed
	}

//	@AfterAll//afterClass

}
