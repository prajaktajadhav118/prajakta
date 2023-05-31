package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	//execution the annotation or methods according to priority 
  @Test()
  public void f() {
	  Reporter.log("f method",true);
  }
  @Test(priority=8)
  public void g() {
	  Reporter.log("g method",true);
  }
  @Test()
  public void h() {
	  Reporter.log("h method",true);
  }
  @Test()
  public void t() {
	  Reporter.log("t method",true);
  }
  @Test(priority=2)
  public void a() {
	  Reporter.log(" a method",true);
  }
  @Test()
  public void k() {
	  Reporter.log("k  method",true);
  }
  @Test()
  public void m() {
	  Reporter.log("m method",true);
  }
  @Test()
  public void p() {
	  Reporter.log(" p method",true);
  }
}
