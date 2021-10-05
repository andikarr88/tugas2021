package qaautomation.tugas2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import qaautomation.tugas2021.utility.Utilty;

public class OpenYopMail extends BaseWebPage{
	CommonPage commonPage = new CommonPage(driver, explicitWait);
	YopMailPage yopMailPage = new YopMailPage(driver, explicitWait);
	
	@Test
	public void testSwitchIframe() {
		commonPage.openUrl("https://yopmail.com/en/");
		String username = "automationtest";
		yopMailPage.openYopMail(username);
		commonPage.newIframe();
		Utilty.hardWait(2);
		yopMailPage.openMail();
		Utilty.hardWait(2);
		
		 
		 
	}
}
