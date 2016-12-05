package com.howtotestngdo.test;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.lang.System;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import PageObjects.HomePage;
import driverSetUp.DriverSetUp;

public class FirstTest extends DriverSetUp {

	SoftAssert s_assert = new SoftAssert();
	private WebDriver driver;
	private HomePage homepage;

	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	
	public void setUp() {
		driver = getDriver();
	}
	
	/*public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}*/

	/*private void setDriver(String browserType, String appURL) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;*/
		/*
		 * case "firefox": driver = initFirefoxDriver(appURL); break;
		 */
		/*default:
			System.out.println("browser : " + browserType + " is invalid");// ,
																			// Launching
																			// Firefox
																			// as
																			// browser
																			// of
																			// choice..");
			// driver = initFirefoxDriver(appURL);
		}
	}*/

	/*private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}*/

	/*
	 * private static WebDriver initFirefoxDriver(String appURL) {
	 * System.out.println("Launching Firefox browser.."); WebDriver driver = new
	 * FirefoxDriver(); driver.manage().window().maximize();
	 * driver.navigate().to(appURL); return driver; }
	 */
	
	
	@Test(description = "Lamps Plus site - Main page - Title")
	public void launchSite() {
		/*
		 * invocando en cada test un nuevo driver cuatriplica o mas el tiempo de
		 * ejecución WebDriver driver = new ChromeDriver ();
		 * driver.manage().window().maximize(); driver.get(URL);
		 */

		//String Title = driver.getTitle();
		//assertEquals("Home Lighting - Fixtures, Lamps & More Online | Lamps Plus", Title);
		homepage = new HomePage(driver);
		Assert.assertTrue(homepage.verifyHomePageTitle(), "Sign In page title doesn't match");
	}


	@Test(description = "Lamps Plus site - Main Navigation menu")
	public void testNavMenu() {

		WebElement optionchandeliers = driver.findElement(By.id("chandeliers"));
		s_assert.assertEquals("Chandeliers", optionchandeliers.getText());

		WebElement optionceilingLighting = driver.findElement(By.id("ceilingLighting"));
		assertEquals("Ceiling Lights", optionceilingLighting.getText());

		WebElement optionlamps = driver.findElement(By.id("lamps"));
		assertEquals("Lamps", optionlamps.getText());

		WebElement optionwallLights = driver.findElement(By.id("wallLights"));
		assertEquals("Wall Lights", optionwallLights.getText());

		WebElement optionoutdoor = driver.findElement(By.id("outdoor"));
		assertEquals("Outdoor Lights", optionoutdoor.getText());

		WebElement optionfans = driver.findElement(By.id("fans"));
		assertEquals("Ceiling Fans", optionfans.getText());

		WebElement optionfurniture = driver.findElement(By.id("furniture"));
		assertEquals("Furniture", optionfurniture.getText());

		WebElement optionhomeDecor = driver.findElement(By.id("homeDecor"));
		assertEquals("Home Decor", optionhomeDecor.getText());

		s_assert.assertAll();
	}

	@Test(description = "Lamps Plus site - Navigation - Chandeliers")
	public void testNavigationChandeliers() {

		WebElement optionchandeliers = driver.findElement(By.id("chandeliers"));
		optionchandeliers.click();
		String Title = driver.getTitle();
		assertEquals("Chandeliers - Elegant Chandelier Designs for Home | Lamps Plus", Title);
	}

	@Test(description = "Lamps Plus site - Navigation - Ceiling Lights")
	public void testNavigationCeilingLights() {

		WebElement optionceilingLighting = driver.findElement(By.id("ceilingLighting"));
		optionceilingLighting.click();
		String Title = driver.getTitle();
		assertEquals("Ceiling Lights - Decorative Ceiling Lighting Fixtures | Lamps Plus", Title);
	}

	@Test(description = "Lamps Plus site - Navigation - Lamps")
	public void testNavigationLamps() {

		WebElement optionlamps = driver.findElement(By.id("lamps"));
		optionlamps.click();
		String Title = driver.getTitle();
		assertEquals("Lamps - Living Room & More | New Designer Lamp Styles | Lamps Plus", Title);
	}

	@Test(description = "Lamps Plus site - Navigation - Wall Lights")
	public void testNavigationWallLights() {

		WebElement optionwallLights = driver.findElement(By.id("wallLights"));
		optionwallLights.click();
		String Title = driver.getTitle();
		assertEquals("Wall Lights - Decorative Wall Light Fixtures | Lamps Plus", Title);
	}

	@Test(description = "Lamps Plus site - Navigation - Outdoor")
	public void testNavigationOutdoor() {

		WebElement optionoutdoor = driver.findElement(By.id("outdoor"));
		optionoutdoor.click();
		String Title = driver.getTitle();
		assertEquals("Outdoor Lighting Fixtures - Porch, Patio & Exterior Light Fixtures | Lamps Plus", Title);
	}

	@Test(description = "Lamps Plus site - Navigation - Fans")
	public void testNavigationFans() {

		WebElement optionfans = driver.findElement(By.id("fans"));
		optionfans.click();
		String Title = driver.getTitle();
		assertEquals("Ceiling Fans - Designer Looks, New Ceiling Fan Designs | Lamps Plus", Title);
	}

	@Test(description = "Lamps Plus site - Navigation - Furniture")
	public void testNavigationFurniture() {

		WebElement optionfurniture = driver.findElement(By.id("furniture"));
		optionfurniture.click();
		String Title = driver.getTitle();
		assertEquals("Furniture and Home Accents | Lamps Plus", Title);
	}

	@Test(description = "Lamps Plus site - Navigation - Home Decor")
	public void testNavigationHomeDecor() {

		WebElement optionhomeDecor = driver.findElement(By.id("homeDecor"));
		optionhomeDecor.click();
		String Title = driver.getTitle();
		assertEquals("Home Decor - Designer Home Accessories | Lamps Plus", Title);
	}
	
	@Parameters({ "appURL" })
	@Test(description = "Lamps Plus site - Chandeliers - By Categories")
	public void testChandeliersList(String paramURL) {

		driver.navigate().to(paramURL + "chandeliers/");
		WebElement ChandeliersOpt1 = driver.findElement(By.xpath("//*[@id=\"lpContainer\"]/div/aside/div[1]/b"));
		String ChOpt = ChandeliersOpt1.getText();
		assertEquals("By Style", ChOpt);
	}

	@BeforeTest
	public void beforeTest() {

	}

	@AfterTest
	public void afterTest() {

		// Close the driver
		driver.quit();
	}

}
