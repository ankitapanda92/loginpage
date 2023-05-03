package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.ActitimeHomePage;
import POM.ActitimeLoginPage;

public class ActitimeLoginLogout {

	@Test	
	private void loginlogout() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.logoutMethod(); 
	}

}
