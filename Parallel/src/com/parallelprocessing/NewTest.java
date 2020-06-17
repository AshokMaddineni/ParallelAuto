package com.parallelprocessing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {

	public WebDriver driver;

	@Parameters("myBrowser")

	@BeforeTest

	public void launchBrowser(String myBrowser) throws Exception {
		if (myBrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\maddi\\Desktop\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (myBrowser.equalsIgnoreCase("chrome")) {
			Thread.sleep(10000);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\maddi\\Desktop\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}

	@Test
	public void tc_1() {
		driver.get("http://www.google.co.in");
		//driver.findElement(By.name("q")).sendKeys("selenium");
	}

}
