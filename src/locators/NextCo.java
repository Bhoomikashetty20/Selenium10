package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextCo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.next.co.uk/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='Close cookies section']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
	}

}
