package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("abcdefgh");
		Thread.sleep(3000);
		//action.moveByOffset(1209, 302).clickAndHold().perform();
		WebElement eyeIcon = driver.findElement(By.xpath("//div[contains(@class,'shownhide')]"));
		action.clickAndHold(eyeIcon).perform();

	}

}
