package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 {
	@Test
	public void TC1() {
		Reporter.log("running Tc1", true);

	}

	@Test
	public void TC2() {
		Reporter.log("running Tc2", true);
	}
	@Test
	public void TC3() {
		Reporter.log("running Tc3", true);
	}

}
