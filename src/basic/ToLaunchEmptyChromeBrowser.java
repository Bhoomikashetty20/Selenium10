package basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchEmptyChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		//EdgeDriver driver=new EdgeDriver();
		

	}

}
