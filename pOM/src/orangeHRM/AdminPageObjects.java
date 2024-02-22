package orangeHRM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPageObjects {
	@FindBy(xpath = "//span[text() ='Admin']")
	public static WebElement enterAdmin;
	@FindBy(xpath = "(//button[contains(@class,'oxd-button oxd-button--medium')])[3]")
	public static WebElement addButton;
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']/li/a/span")
	public static  List<WebElement>  bannerlist;
}
