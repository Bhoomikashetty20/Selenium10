package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("254145541");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='Multiple']/iframe")));
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='iframe-container']/iframe")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123456879");

	}

}
