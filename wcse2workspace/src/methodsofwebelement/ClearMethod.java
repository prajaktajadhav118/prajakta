package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-aigvo6j/login.do");
	
		
		WebElement userNameTB = driver.findElement(By.name("username"));
		userNameTB.sendKeys("admin");
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		userNameTB.sendKeys("admin123");
		passwordTB.sendKeys("manager123");
		
		Thread.sleep(2000);
		userNameTB.clear();
		Thread.sleep(1000);
		passwordTB.clear();
		
	//	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
	}
}
