package PageObjects;

//import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class HomePage {
	
	WebDriver driver;
	
	@FindBy(how=How.ID, using="chandeliers")
	private WebElement optionchandeliers;
	
	@FindBy(how=How.ID, using="ceilingLighting")
	private WebElement optionceilingLighting;
	
	@FindBy(how=How.ID, using="lamps")
	private WebElement optionlamps;
	
	@FindBy(how=How.ID, using="wallLights")
	private WebElement optionwallLights;
	
	@FindBy(how=How.ID, using="outdoor")
	private WebElement optionoutdoor;
	
	@FindBy(how=How.ID, using="fans")
	private WebElement optionfans;
	
	@FindBy(how=How.ID, using="furniture")
	private WebElement optionfurniture;
	
	@FindBy(how=How.ID, using="homeDecor")
	private WebElement optionhomeDecor;
	

	//String [] MenuOptions = {"Chandeliers","Ceiling Lights","Lamps","Wall Lights"};*/
	
	
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
	
	
	public String getOptionText(String MenuOption){
		String varOption = null;

			switch(MenuOption) {
		        case "Chandeliers":
				  	varOption = optionchandeliers.getText();
				break;
		        case "Ceiling Lights":
				  	varOption = optionceilingLighting.getText();
				break;
		        case "Lamps":
		        	varOption = optionlamps.getText();
		        break;
		        case "Wall Lights":
		        	varOption = optionwallLights.getText();
		        break;
		        default:
		        	break;
			}
		return varOption;
	}
	
	public boolean verifyOptionText(String MenuOption){
		String expectedOption = null;
		
		switch(MenuOption) {
	        case "Chandeliers":
			 	expectedOption="Chandeliers";
			break;
	        case "Ceiling Lights":
	        	expectedOption= "Ceiling Lights";
	        break;
	        case "Lamps":
	        	expectedOption= "Lamps";
	        break;
	        case "Wall Lights":
	        	expectedOption= "Wall Lights";
	        break;
	        default:
	        break;
		}
		return getOptionText(MenuOption).contains(expectedOption);
	}
}
