package orangeHRM;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AdminAddUser implements BaseClass {
	@Test
	public void adduser() throws InterruptedException
	{
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		PageFactory.initElements(driver, AdminPageObjects.class);
		wait.until(ExpectedConditions.elementToBeClickable(AdminPageObjects.enterAdmin)).click();
		wait.until(ExpectedConditions.visibilityOfAllElements(AdminPageObjects.bannerlist));
		System.out.println("The BannerList's are :");
		for (WebElement iterable_element : AdminPageObjects.bannerlist) {
			String stringlist=iterable_element.getText();
					//AddUserPageObjects.bannerlist.get(i).getText();
			System.out.println(stringlist);
		}		
		wait.until(ExpectedConditions.elementToBeClickable(AdminPageObjects.addButton)).click();		
		Thread.sleep(3000);
		driver.close();
	}
	
	

}
