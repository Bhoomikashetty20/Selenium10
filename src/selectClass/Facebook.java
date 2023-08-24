package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/campaign/landing.php");
		//date drop down
		WebElement datedropDown = driver.findElement(By.id("day"));
		Select date=new Select(datedropDown);
		date.selectByIndex(19);
		Thread.sleep(2000);
	
		//month drop down
		WebElement monthdropDown = driver.findElement(By.id("month"));
		Select month=new Select(monthdropDown);
		month.selectByValue("6");
		Thread.sleep(2000);
		List<WebElement> allOptions = month.getOptions();
		for(WebElement ele: allOptions) {
			System.out.println(ele.getText());
		}
		
		//year drop down
		WebElement yeardropDown = driver.findElement(By.id("year"));
		Select year=new Select(yeardropDown);
		year.selectByVisibleText("2018");
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
