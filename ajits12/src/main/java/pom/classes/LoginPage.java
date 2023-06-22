package pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy (xpath="//input[@name=\"username\"]") 
	private WebElement username;
	
	@FindBy (xpath="//input[@name=\"password\"]") 
	private WebElement password;
	
	@FindBy (xpath="//button[@type=\"submit\"]") 
	private WebElement loginbtn;
	
	public LoginPage (WebDriver Driver) {
		PageFactory.initElements(Driver,this);
		
	}
	public  void Usernamekey() {
		username.sendKeys("Admin");
	}
	public void passwordkey() {
		password.sendKeys("manger");
	}
	public void loginbtn1() {
	loginbtn.click();
	}
	

}
