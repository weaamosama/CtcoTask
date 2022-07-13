package maven.ctco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import generics.GeneralMethods;;


public class Vacancy 
{
	WebDriver driver;
	GeneralMethods generals;
	

	public Vacancy(final WebDriver driver) 
	{
		this.driver = driver;
		this.generals = new GeneralMethods(driver);
	}
	
	

	public void openCareers() 
	{

		driver.findElement(By.xpath("//*[@id=\"menu-item-127\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-131\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-5079\"]/a")).click();
		
	}
	
	public int countProf()
	{
		return driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[9]/div/div/ul[1]/li")).size();
		
		
	}



}

