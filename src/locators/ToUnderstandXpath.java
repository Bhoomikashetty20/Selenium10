package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		String errorMsg = driver.findElement(By.xpath("//span[contains(text(),'errors')]")).getText();
		System.out.println(errorMsg);
		
		Thread.sleep(4000);
		driver.quit();

	}

}
