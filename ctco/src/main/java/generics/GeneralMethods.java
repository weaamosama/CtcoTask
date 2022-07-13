package generics;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class GeneralMethods {
	WebDriver driver;
	JavascriptExecutor jse;


	public GeneralMethods(WebDriver driver) {
		this.driver = driver;
		jse = (JavascriptExecutor) driver;
		
	}


	public void waitInSeconds() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

	}
	

	public void openURL() {
		driver.navigate().to("https://ctco.lv");
		driver.manage().window().maximize();
	}

	

	public void advancedRefresh() {
		driver.navigate().to(driver.getCurrentUrl());
	}

	
}
