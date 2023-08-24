package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("JEWELRY")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Diamond Heart")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@class='short-description']")).getText();
		System.out.println(text);
		
		Thread.sleep(4000);
		driver.quit();
	}

}
