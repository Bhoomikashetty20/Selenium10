package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToUnderstandCloseQuitMethod {

	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(5000);
		driver.quit();

	}

}
