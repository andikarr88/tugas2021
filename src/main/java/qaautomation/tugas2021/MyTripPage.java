package qaautomation.tugas2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class MyTripPage extends BasePage{

	By From = By.xpath("//*[@id=\"fromCity\"]");
	By Klik = By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div[1]");
	
	public MyTripPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public void clickFrom() {
		clickAndWaitByXpath(Klik);
	}
	
	public void selectFrom(String from) {
		setText(From, from);
	}

}
