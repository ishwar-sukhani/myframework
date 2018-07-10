package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appModule.SignIn_Action;
import pageObjects.HomePage;
import utilities.Constant;

public class POM_TC {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constant.URL);
		SignIn_Action.execute(driver,Constant.Username,Constant.Password);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		HomePage.lnk_Logout(driver).click();
		System.out.println("Logged-out successfully");
		driver.quit();
		System.out.println("Browser Closed... Test is finished");
	}
}
