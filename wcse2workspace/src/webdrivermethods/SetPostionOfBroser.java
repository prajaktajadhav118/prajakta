package webdrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetPostionOfBroser {

	private static Point targetPoint;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.manage().window().setPosition(targetPoint);
		
		Point targetPosition = new Point(450,350);
		Thread.sleep(2000);
		driver.manage().window().setPosition(targetPosition);
	}
}

