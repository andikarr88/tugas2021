package qaautomation.tugas2021;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage extends BasePage{

	public CommonPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public void openUrl(String url) {
		driver.get().get(url);
		
	}
	
	public void newTab() {
		driver.get().switchTo().newWindow(WindowType.TAB);
		
	}
	
	public void newWindow() {
		driver.get().switchTo().newWindow(WindowType.WINDOW);
		
	}
	
	public void newIframe() {
		driver.get().switchTo().frame("ifinbox");
	}
	
	public void switchWindow(int index) {
		Set<String> handles = driver.get().getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(handles);
		driver.get().switchTo().window(tabs.get(index));
	}
	
	public void runJSCommand(String inputComand) {
		JavascriptExecutor js = (JavascriptExecutor) driver.get();
		js.executeScript(inputComand);
	}
	
	public void acceptAlert() {
		driver.get().switchTo().alert().accept();
		
	}
	
	public void navigateBrowser(String action) {
		if (action.equalsIgnoreCase("forward")) {
			driver.get().navigate().forward();
		}
		if (action.equalsIgnoreCase("back")) {
			driver.get().navigate().back();
		}
		if (action.equalsIgnoreCase("refresh")) {
			driver.get().navigate().refresh();
		}
	}

}
