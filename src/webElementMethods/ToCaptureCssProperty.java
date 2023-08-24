package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureCssProperty {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://de+mowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		System.out.println(element.getCssValue("color"));
		System.out.println(element.getAttribute("alt"));
	}

}
