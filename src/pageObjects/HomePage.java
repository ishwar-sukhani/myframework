package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private static WebElement element = null;
	
	public static WebElement lnk_MyAccount(WebDriver driver){
		element = driver.findElement(By.id("account"));
		return element;
	}
	
	public static WebElement lnk_Checkout(WebDriver driver){
		element = driver.findElement(By.linkText("Checkout")); 
		return element;
	}
	
	public static WebElement lnk_Logout(WebDriver driver){
		element = driver.findElement(By.linkText("(Logout)")); 
		return element;
	}
}
