package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo {
	@FindBy(xpath="//input[@name='email']") private WebElement userID;
	@FindBy (xpath="//input[@name='pass']") private WebElement pass;
	@FindBy (xpath="//button[@name='login']") private WebElement loginBtn;
    Demo(WebDriver driver){
    	PageFactory.initElements(driver,this);
    }
    public void enterUserId(String id) {
    	userID.sendKeys(id);
    }
    public void enterPass(String id) {
    	pass.sendKeys(id);
    }
    public void loginbtnclick() {
    	loginBtn.click();
    }
    
}
