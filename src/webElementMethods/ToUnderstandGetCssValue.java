package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetCssValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement errorMsg = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		System.out.println(errorMsg.getCssValue("color"));
		System.out.println(errorMsg.getCssValue("font-family"));
		
		//System.out.println(errorMsg.getAttribute("class"));

	}

}
