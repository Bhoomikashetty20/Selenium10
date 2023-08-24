package jsExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		JavascriptExecutor js=driver;
		
		driver.get("https://polarbear.co.in/");
		Thread.sleep(2000);
		WebElement img = driver.findElement(By.id("sbi_18064600978340492"));
		js.executeScript("arguments[0].scrollIntoView(false)", img);

	}

}
