package webdrivermethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.filpkart.com");
	    driver.findElement(By.xpath("//button[.='x']")); 
	    driver.findElement(By.name("q")).sendKeys("mobiles");
	    driver.findElement(By.xpath(" //button[@class='L0Z3Pu']")).click();
	    
	    Thread.sleep(2000);
	    @SuppressWarnings("unused")
		List<WebElement>mobiles=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	    //List<WebElement>spriceofmobiles=driver.findElements(By.xpath("//dive[@class='_4rR01T']/ ancestor:
	    
	}

}
