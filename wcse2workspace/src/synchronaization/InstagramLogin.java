package synchronaization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("jadhav");
		driver.findElement(By.name ("Password")).sendKeys("abuytytc@");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();

	}

}
