package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureScreenshotOfWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://wildcraft.com/");
		Thread.sleep(2000);
		WebElement img = driver.findElement(By.xpath("//img[@title='Wildcraft']"));
		File src = img.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorShots/img2.png");
		FileHandler.copy(src, dest);
		
		Thread.sleep(4000);
		driver.quit();

	}

}
