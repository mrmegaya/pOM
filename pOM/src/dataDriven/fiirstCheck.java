package dataDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fiirstCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("HI");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megay\\eclipse-workspace\\pOM\\EXEs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

}
