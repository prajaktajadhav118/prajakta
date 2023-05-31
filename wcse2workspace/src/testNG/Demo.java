package testNG;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  System.out.println("hii TestNG");
	  Reporter.log("hiii TestNG!!",true);
	  
  }
  @Test
  public void g()
  {
	 System.out.println("hey java");
	 Reporter.log("hey java!!,true");
  }
}
