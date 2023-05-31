package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flage7 {
	// to perform group execution
  @Test(groups="Functional Testing")
  public void ft1() {
	  Reporter.log("FTC1",true);
  }
  @Test(groups="System Testing")
  public void st1() {
	  Reporter.log("STC1",true);
  }
  @Test(groups="Integation Testing")
  public void it1() {
	  Reporter.log("ITC1",true);
  }
  //=========================================
  @Test(groups="Functional Testing")
  public void ft2() {
	  Reporter.log("FTC2",true);
  } 
  @Test(groups="Smoke Testing")
	  public void s2() {
		  Reporter.log("SMTC2",true);
	  }
	  
	  @Test(groups="Integation Testing")
	  public void it2() {
		  Reporter.log("ITC2",true);
	  }
	  //======================================
	  @Test(groups="Functional Testing")
	  public void ft3() {
		  Reporter.log("FTC3",true);
	  }
		  @Test(groups="System Testing")
		  public void St3() {
			  Reporter.log("STC3",true);
		  }
			  @Test(groups="Integation  Testing")
			  public void it3() {
				  Reporter.log("IMTC3",true);
			  }
			  
	 //=====================================
			  @Test(groups="Functional Testing")
			  public void ft4() {
				  Reporter.log("FTC4",true);
			  }
			  @Test(groups="System Testing")
			  public void st4() {
				  Reporter.log("STC3",true);
			  }
			  @Test(groups="Integation Testing")
			  public void it4() {
				  Reporter.log("ITC4",true);
			  }
			  //============================================
			  @Test(groups="Functional Testing")
			  public void ft5() {
				  Reporter.log("FTC5",true);
			  }
			  @Test(groups="System Testing")
			  public void St4() {
				  Reporter.log("STC4",true);
			  }
			  @Test(groups="Integation Testing")
			  public void it5() {
				  Reporter.log("ITC5",true);
			  }

}
