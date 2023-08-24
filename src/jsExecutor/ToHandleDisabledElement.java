package jsExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		JavascriptExecutor js=driver;
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement disabledEle = driver.findElement(By.xpath("//input[@class='form-control']"));
		js.executeScript("arguments[0].value='Automation testing'", disabledEle);
		Thread.sleep(4000);
		driver.quit();

	}

}
