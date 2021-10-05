package qaautomation.tugas2021;

import org.testng.annotations.Test;

import qaautomation.tugas2021.utility.Utilty;

public class OpenMyTrip extends BaseWebPage {
	CommonPage commonPage = new CommonPage(driver, explicitWait);
	MyTripPage myTripPage = new MyTripPage(driver, explicitWait);
	
	@Test
	public void myTrip() {
		commonPage.openUrl("https://www.makemytrip.com/");
		myTripPage.clickFrom();
		Utilty.hardWait(2);
		myTripPage.selectFrom("Jakarta, Indonesia");
	}
}
