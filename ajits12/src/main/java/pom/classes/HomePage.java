package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// my insurance club
public class HomePage {
	@FindBy (xpath="//*[@id=\"__next\"]/div/div/main/div/div/div[1]/div[1]/div/div[2]/a[1]/div")
	private WebElement Termins;
	
	@FindBy (xpath="/html/body/div/div/div/main/div/div/div[1]/div[1]/div/div[1]/div[1]/div[2]/a/span") 
	private WebElement CalPremiumbtm;
	
	@FindBy (xpath="//input[@type=\"radio\"][1]") 
	private WebElement Malebtn;
	
	@FindBy (xpath="//input[@type=\"radio\"][2]") 
	private WebElement Femalebtn;
	
	@FindBy (xpath="//input[@type=\"range\"]") 
	private WebElement Age;
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickterminsu() {
		Termins.click();
	}
	public void clickcalPremiumbtm() {
		CalPremiumbtm.click();
	}
	public void clickmalebtn() {
		Malebtn.click();
	}
	public void clickfemalebtn() {
		Femalebtn.click();
	}
	public void sendage() {
		Age.sendKeys("45");
	}
	
	

	}
	
	
	
	
	

