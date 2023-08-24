package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		driver.get("https://licindia.in/branch");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.partialLinkText("Login"));
		action.moveToElement(login).perform();
		driver.findElement(By.linkText("Agent Portal")).click();
		Alert confirmationPopUp = driver.switchTo().alert();
		Thread.sleep(2000);
		//confirmationPopUp.dismiss();
		confirmationPopUp.accept();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
