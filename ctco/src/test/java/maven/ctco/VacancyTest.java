package maven.ctco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import generics.GeneralMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VacancyTest 
{
	WebDriver driver;
	GeneralMethods general;
	Vacancy Vacancies;



	@BeforeTest
	public void beforeTest() 
	{
	ChromeOptions option = new ChromeOptions();
	option.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(option);
	general = new GeneralMethods(driver);
	general.openURL();
	Vacancies = new Vacancy(driver);
	general.waitInSeconds();
	
	
	}

	@Test (priority = 1, enabled = true)
	public void Careers() 
	{
		int expectedProfessionalSkillsQualification = 8 ;
		Vacancies.openCareers();
		Assert.assertEquals(expectedProfessionalSkillsQualification, Vacancies.countProf());

	}


	@AfterClass(enabled = false)
	public void teardown() {
		driver.close();
	}
}
