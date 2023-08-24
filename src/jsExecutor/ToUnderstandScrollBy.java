package jsExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandScrollBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		JavascriptExecutor js=driver;
		
		driver.get("https://www.google.com/doodles");
		for(;;) {
			try {
				driver.findElement(By.linkText("Celebrating Pani Puri")).click();
				break;
			}catch (Exception e) {
				js.executeScript("window.scrollBy(0,150)");
			}
		}

	}

}
