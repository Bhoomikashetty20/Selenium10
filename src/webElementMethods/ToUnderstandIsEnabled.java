package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(loginButton.isEnabled()); //false
		
		driver.findElement(By.name("username")).sendKeys("cchjvkjvyx");
		driver.findElement(By.name("password")).sendKeys("ghcghvhjvhgv");
		Thread.sleep(2000);
		System.out.println(loginButton.isEnabled()); //true
		
		
		Thread.sleep(4000);
		driver.quit();

	}

}
