package PageObjects;

import org.openqa.selenium.*;

import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
	WebDriver driver;
	
	private By optionchandeliers = By.id("chandeliers");
	private By optionceilingLighting = By.id("ceilingLighting");
	private By optionlamps = By.id("lamps");
	private By optionwallLights = By.id("wallLights");
	private By optionoutdoor = By.id("outdoor");
	private By optionfans = By.id("fans");
	private By optionfurniture = By.id("furniture");
	private By optionhomeDecor = By.id("homeDecor");
	
	String options[] = {"Chandeliers"};
	
	
	public HomePage(WebDriver driver){
		this.driver=driver;
	}
	
	public String getHomePageTitle(){
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public boolean verifyHomePageTitle() {
		String expectedPageTitle="Home Lighting - Fixtures, Lamps & More Online | Lamps Plus";
		return getHomePageTitle().contains(expectedPageTitle);
	}
	
	
	/*public String getOptionText(){
	 * 	WebElement option = driver.findElement(optionchandeliers);	
	 * 	String varOption = option.getText();
		return varOption;
		
	}*/
	
	/*public boolean verifyOptionText(){
	 *	String expectedOption="Chandeliers - Elegant Chandelier Designs for Home | Lamps Plus";
		return getOptionText().contains(expectedOption);
	}*/
}
