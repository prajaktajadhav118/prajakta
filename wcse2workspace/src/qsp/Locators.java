package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver	driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.netflix.com/in/Login");
	     
	     Thread.sleep(2000);
	     driver.findElement(By.id("id_userLoginId")).sendKeys("ram");
	     Thread.sleep(2000);
	     driver.findElement(By.id("id_password")).sendKeys("@A123qwwe");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		

	}

}
