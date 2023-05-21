package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://shree-pc/login.do");
	    WebElement userNameTB = driver.findElement(By.name("username"));
        userNameTB.sendKeys("admin123");
		WebElement passwordTB = driver.findElement(By.name("pwd"));
	    passwordTB.sendKeys("manager123");
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(2000);
	    
		
	}

}
