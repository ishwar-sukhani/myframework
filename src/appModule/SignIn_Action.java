package appModule;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class SignIn_Action {
	
	public static void execute(WebDriver driver, String username, String password){
		// Click on MyAccount link to login
		HomePage.lnk_MyAccount(driver).click();
		// Enter Username
		LoginPage.txtbx_Username(driver).sendKeys(username);
		// Enter Password
		LoginPage.txtbx_Password(driver).sendKeys(password);
		// Click Login 
		LoginPage.btn_Login(driver).click();
		// Success Message
		System.out.println("Logged-in Successfully");

	}
}
