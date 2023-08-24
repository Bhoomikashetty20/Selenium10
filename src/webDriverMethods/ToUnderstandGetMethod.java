package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandGetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		// capture the title of the web page
		String title = driver.getTitle();
		System.out.println(title);

	}

}
