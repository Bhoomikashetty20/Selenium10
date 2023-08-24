package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(2000);
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		Thread.sleep(2000);
		Alert alertPopUp = driver.switchTo().alert();
		//alertPopUp.accept();
		alertPopUp.dismiss();
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
