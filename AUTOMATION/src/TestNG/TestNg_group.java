package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg_group {
	@Test(groups="facebook")
	public void Tc1() {
		Reporter.log("running TC1", true);
	}
	@Test(groups="whatsapp")
	public void Tc2() {
		Reporter.log("running TC2", true);
	}
	@Test(groups="Gmail")
	public void Tc3() {
		Reporter.log("running TC3", true);
	}
	@Test(groups="Gmail")
	public void Tc4() {
		Reporter.log("running TC4", true);
	}
	@Test(groups="facebook")
	public void Tc5() {
		Reporter.log("running TC5", true);
	}
	@Test(groups="amazon")
	public void Tc6() {
		Reporter.log("running TC6", true);
	}
	@Test(groups="whatsapp")
	public void Tc7() {
		Reporter.log("running TC7", true);
	}
	
}
