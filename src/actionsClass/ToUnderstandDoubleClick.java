package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement add = driver.findElement(By.id("add"));
		WebElement minus = driver.findElement(By.id("minus"));
		action.doubleClick(add).perform();
		Thread.sleep(1000);
		action.doubleClick(add).perform();
		Thread.sleep(1000);
		action.doubleClick(minus).perform();
	}

}
