package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {
	public WebDriver driver;
 
	@FindBy(xpath = "//input[@name='username']")
	public static WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement  LoginButton;
	
	
	

}
