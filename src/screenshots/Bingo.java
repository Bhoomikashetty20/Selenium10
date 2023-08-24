package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Bingo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://bingosnacks.com/");
		Thread.sleep(2000);
		
		//capture the screenshot of webpage
		File webpageimg = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorShots/img3.png");
		FileHandler.copy(webpageimg, dest);
		
		//capture the screenshot of webelement
		WebElement logo = driver.findElement(By.xpath("//img[@title='Bingo!']"));
		File eleImg = logo.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./errorShots/img4.png");
		FileHandler.copy(eleImg, dest1);

		
		Thread.sleep(4000);
		driver.quit();

	}

}
