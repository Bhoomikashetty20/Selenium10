package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.dream11.com/");
		//Using index
		//driver.switchTo().frame(0);
		
		//using id
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.id("regEmail")).sendKeys("9876543210");

	}

}
