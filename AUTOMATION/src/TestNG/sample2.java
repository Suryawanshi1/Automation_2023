package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2 {
	@Test
	public void TC4() {
		Reporter.log("running Tc4", true);
	}
	
	@Test
	public void TC5() {
		Reporter.log("running Tc5", true);
	}
	@Test
	public void TC6() {
		Reporter.log("running Tc6", true);
	}
	@Test
	public void TC7() {
		Reporter.log("running Tc7", true);
	}

}
