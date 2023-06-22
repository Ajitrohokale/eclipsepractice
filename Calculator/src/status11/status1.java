package status11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class status1 {
	public void Status1_1(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\Webdd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		boolean sts = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println(sts);
		//false	
		
	}
	public void web() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\Webdd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		WebElement malebtn=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean sts1= malebtn.isDisplayed();
		boolean sts2= malebtn.isEnabled();
		boolean sts3=malebtn.isSelected();
		System.out.println("before selected");
		System.out.println("is displayed  "+sts1);
		System.out.println("is Enabled  "+sts2);
		System.out.println("is selected  "+sts3);
		WebElement malebtn1=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		malebtn1.click();
		boolean sts4= malebtn1.isDisplayed();
		boolean sts5= malebtn1.isEnabled();
		boolean sts6=malebtn1.isSelected();
		System.out.println("after selected");
		System.out.println("is displayed  "+sts4);
		System.out.println("is Enabled  "+sts5);
		System.out.println("is selected  "+sts6);
	}
	
	
}
