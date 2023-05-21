package xpathLocater;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		 
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("prajakta@12");
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@placeholder='SIGN IN']")).click();
		//Thread.sleep(2000);

	}

}