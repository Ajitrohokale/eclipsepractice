package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto11 {
	public void Auto2() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\Webdd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com//");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("rohokaleajit128@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("au121995");
		driver.findElement(By.xpath("//button[contains(text(), 'Log')]")).click();
		
	}
	public static void main(String[] args)  {
		Auto11 as =new Auto11();
		as.Amazon();
		
	}
	public void Amazon() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\Webdd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=74238127911&hvpone=&hvptwo=&hvadid=610644609009&hvpos=&hvnetw=g&hvrand=2531766361225134928&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-29089120&hydadcr=5496_2359482&gclid=EAIaIQobChMIkLGdj5jT_QIVlH4rCh0Kngv1EAAYASAAEgJFVPD_BwE");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(" Mango syrup");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2")).click();
		driver.findElement(By.xpath("//*[@id=\"submit.add-to-cart-button\"]")).click();//not working
	}
	public void webdriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Avinash\\Desktop\\New folder\\Webdd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}

}
