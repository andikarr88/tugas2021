package qaautomation.tugas2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YopMailPage extends BasePage {

	By username = By.xpath("//*[@id=\"login\"]");
	By Btn = By.xpath("//*[@id=\"refreshbut\"]");
	By Mail = By.xpath("//*[@id=\"e_ZwRjBGV0ZGHjAGHlZQNjAGt5AGZkAt==\"]");
	By Value = By.id("mail");
	
	
	public YopMailPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public void openYopMail(String user) {
		setText(username, user);
		clickAndWaitByXpath(Btn);
		
	}
	
	public void openMail() {
		clickAndWaitByXpath(Mail);
		
	}
}
