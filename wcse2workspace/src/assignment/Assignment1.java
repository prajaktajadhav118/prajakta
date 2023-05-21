package assignment;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {


		private static final org.openqa.selenium.Dimension Dimension = null;
		private static final org.openqa.selenium.Point Point = null;

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			// maximize the browser
			driver.manage().window().maximize();
			Thread.sleep(4000);
			// setSize of Browser
			@SuppressWarnings("unused")
			Dimension targetSize = new Dimension(300,450);
			driver.manage().window().setSize(Dimension);
			// setPosition of Browser
			Thread.sleep(4000);
			@SuppressWarnings("unused")
			Point targetPosition = new Point(350,350);
			driver.manage().window().setPosition(Point);
			
		
	}

}
