package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		driver.findElement(By.xpath("//a[contains(text(),'$100 Physical')]/../..//input[@value='Add to cart']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@itemprop='price']")).getText());

	}

}
