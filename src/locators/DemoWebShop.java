package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("xrtvkjvk");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("cyfviu");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("bvbsdkbc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("abcdef");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcdef");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();

	}

}
