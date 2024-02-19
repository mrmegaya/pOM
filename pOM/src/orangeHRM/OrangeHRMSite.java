package orangeHRM;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrangeHRMSite {
	public static WebDriver driver;
	@Test
	public void Login() throws InterruptedException
	{		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		PageFactory.initElements(driver, LoginPageObjects.class);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15)); 
		wait.until(ExpectedConditions.visibilityOf(LoginPageObjects.username)).sendKeys("Admin");
		LoginPageObjects.password.sendKeys("admin123");
		LoginPageObjects.LoginButton.click();
		PageFactory.initElements(driver, AddUserPageObjects.class);
		wait.until(ExpectedConditions.elementToBeClickable(AddUserPageObjects.enterAdmin)).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(AddUserPageObjects.bannerlist));
		System.out.println("The BannerList's are :");
		for (WebElement iterable_element : AddUserPageObjects.bannerlist) {
			String stringlist=iterable_element.getText();
					//AddUserPageObjects.bannerlist.get(i).getText();
			System.out.println(stringlist);
		}		
		wait.until(ExpectedConditions.elementToBeClickable(AddUserPageObjects.addButton)).click();		
		Thread.sleep(3000);
		driver.close();
	}
}
