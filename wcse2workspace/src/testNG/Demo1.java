package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void Demo1method() {
	  System.out.println("hii TestNG!!!");
	  Reporter.log("hii TestNG!!!");
  }
 
}
