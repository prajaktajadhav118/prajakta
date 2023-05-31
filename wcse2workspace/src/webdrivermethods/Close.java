package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers./chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://omayo.blogspot.com/");
			Thread.sleep(2000);
			driver.close();
	

	}

}
