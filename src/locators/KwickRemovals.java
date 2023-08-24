package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KwickRemovals {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kwickremoval.co.uk/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Contact us")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'contact')]")).getText());
		
		Thread.sleep(4000);
		driver.quit();

	}

}
