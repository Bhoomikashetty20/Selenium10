package actionsClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frameEle = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frameEle);
//		WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
//		WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
//		WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
//		WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
//		WebElement trash = driver.findElement(By.id("trash"));
//		
//		action.dragAndDrop(img1, trash).perform();
//		action.dragAndDrop(img2, trash).perform();
//		action.clickAndHold(img3).release(trash).perform();
//		Thread.sleep(2000);
//		action.moveToElement(img4).clickAndHold().release(trash).perform();
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='gallery']/li/img"));
		WebElement trash = driver.findElement(By.id("trash"));
		for(WebElement img:elements) {
			action.dragAndDrop(img, trash).perform();
		}
		
		Thread.sleep(4000);
		driver.quit();

	}

}
