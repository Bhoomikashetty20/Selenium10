package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandMultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement listBox = driver.findElement(By.id("cars"));
		Select selectOption=new Select(listBox);
		System.out.println(selectOption.isMultiple());
		
		//selectByIndex
		selectOption.selectByIndex(2);
		Thread.sleep(1000);
		//selectByValue
		selectOption.selectByValue("99");
		Thread.sleep(1000);
		//selectByVisibleText
		selectOption.selectByVisibleText("INR 200 - INR 299 ( 3 )");
		
		//capture all the selected options
//		List<WebElement> selectedOptions = selectOption.getAllSelectedOptions();
//		for(WebElement ele:selectedOptions) {
//			System.out.println(ele.getText());
//		}
		
		System.out.println(selectOption.getFirstSelectedOption().getText());
		
		
		Thread.sleep(4000);
		driver.quit();
		

	}

}
