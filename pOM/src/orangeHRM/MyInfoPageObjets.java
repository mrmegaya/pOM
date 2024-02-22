package orangeHRM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyInfoPageObjets {
	
	@FindBy(xpath = "//span[text()='My Info']")
	public static WebElement myinfobutton;
	@FindBy(xpath = "//a[text()='Personal Details']")
	public static WebElement PersonalDetails;
	@FindBy(xpath = "//input[@name='middleName']")
	public static WebElement middleName;
	@FindBy(xpath = "//a[text()='Contact Details']")
	public static WebElement ContactDetails;
	

}
